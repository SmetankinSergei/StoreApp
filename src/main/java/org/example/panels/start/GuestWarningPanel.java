package org.example.panels.start;

import org.example.StartApp;
import org.example.buttons.ButtonType;
import org.example.buttons.SimpleButton;
import org.example.panels.*;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.example.service.ImagesManager;
import org.example.user.UserState;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.List;

@Component
public class GuestWarningPanel extends SubStartPanel {

    SimpleButton enterGuestModeButton;
    SimpleButton exitGuestModeButton;

    @Override
    protected void addButtons() {
        Dimensions noButtonDimensions = new Dimensions(42, 162, 138, 40);
        Dimensions yesButtonDimensions = new Dimensions(220, 162, 138, 40);
        if (enterGuestModeButton == null) enterGuestModeButton = BeanManager.getSimpleButton();
        if (exitGuestModeButton == null) exitGuestModeButton = BeanManager.getSimpleButton();
        addButton(BeanManager.getSimpleButton(), ButtonType.GUEST_NO, this, noButtonDimensions);
        addButton(enterGuestModeButton, ButtonType.GUEST_YES, this, yesButtonDimensions);
        addButton(exitGuestModeButton, ButtonType.CONFIRM_EXIT_GUEST_MODE, this, yesButtonDimensions);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.GUEST_NO) unfocus();
        else if (buttonType == ButtonType.GUEST_YES) {
            BeanManager.getUser().setState(UserState.GUEST_USER);
            List<MainPanel> mainPanelsList = StartApp.getMainPanelsList();
            for (MainPanel mainPanel : mainPanelsList) mainPanel.hideButtonsFromGuest();
            unfocus();
        }
        else if (buttonType == ButtonType.CONFIRM_EXIT_GUEST_MODE) {
            BeanManager.getUser().setState(UserState.NEW_USER);
            List<MainPanel> mainPanelsList = StartApp.getMainPanelsList();
            for (MainPanel mainPanel : mainPanelsList) mainPanel.hideButtonsBeforeAuth();
            unfocus();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (BeanManager.getUser().getState() == UserState.NEW_USER) {
            g.drawImage(ImagesManager.getGuestWarningPanelImg(), 0, 0, this);
            exitGuestModeButton.setVisible(false);
            enterGuestModeButton.setVisible(true);
        } else if (BeanManager.getUser().getState() == UserState.GUEST_USER) {
            g.drawImage(ImagesManager.getWarningExitGuestModePanelImg(), 0, 0, this);
            exitGuestModeButton.setVisible(true);
            enterGuestModeButton.setVisible(false);
        }
    }
}
