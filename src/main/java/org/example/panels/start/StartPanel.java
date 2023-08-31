package org.example.panels.start;

import org.example.buttons.ButtonType;
import org.example.buttons.SimpleButton;
import org.example.panels.*;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.example.user.User;
import org.example.user.UserState;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

@Component
public class StartPanel extends MainPanel implements Fillable, Recyclable {

    SimpleButton authButton;
    SimpleButton regButton;
    SimpleButton enterGuestModeButton;
    SimpleButton exitGuestModeButton;
    List<Focusable> focusablePanels = new ArrayList<>();
    GuestWarningPanel warningPanel;
    AuthorizationPanel authPanel;
    RegistrationPanel regPanel;
    User user;

    public StartPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                for (Focusable focusablePanel : focusablePanels) {
                    if (checkFocusablePanelCoordinates(e, focusablePanel)) {
                        focusablePanel.unfocus();
                    }
                }
            }
        });
    }

    private boolean checkFocusablePanelCoordinates(MouseEvent e, Focusable panel) {
        return  (e.getX() < ((JPanel) panel).getX() || e.getX() > ((JPanel) panel).getX() + ((JPanel) panel).getWidth() ||
                e.getY() < ((JPanel) panel).getY() || e.getY() > ((JPanel) panel).getY() + ((JPanel) panel).getHeight());
    }

    private void addButtons() {
        Dimensions authButtonDimensions = new Dimensions(192, 300, 316, 40);
        Dimensions regButtonDimensions = new Dimensions(192, 360, 316, 40);
        Dimensions enterGuestModeButtonDimensions = new Dimensions(192, 420, 316, 40);
        Dimensions exitGuestModeButtonDimensions = new Dimensions(192, 420, 316, 40);
        if (authButton == null) authButton = BeanManager.getSimpleButton();
        if (regButton == null) regButton = BeanManager.getSimpleButton();
        if (enterGuestModeButton == null) enterGuestModeButton = BeanManager.getSimpleButton();
        if (exitGuestModeButton == null) exitGuestModeButton = BeanManager.getSimpleButton();
        addButton(authButton, ButtonType.AUTHORIZATION, this, authButtonDimensions);
        addButton(regButton, ButtonType.REGISTRATION, this, regButtonDimensions);
        addButton(enterGuestModeButton, ButtonType.ENTER_GUEST_MODE, this, enterGuestModeButtonDimensions);
        addButton(exitGuestModeButton, ButtonType.EXIT_GUEST_MODE, this, exitGuestModeButtonDimensions);
        if (user.getState() == UserState.GUEST_USER) {
            enterGuestModeButton.setVisible(false);
            exitGuestModeButton.setVisible(true);
        } else {
            enterGuestModeButton.setVisible(true);
            exitGuestModeButton.setVisible(false);
        }
        showMainButtons();
    }

    private void showMainButtons() {
        if (user.getState() == UserState.NEW_USER) {
            hideButtonsBeforeAuth();
        } else if (user.getState() == UserState.GUEST_USER) {
            hideButtonsFromGuest();
        } else if (user.getState() == UserState.AUTHORIZED_USER) {
            uncoverButtons();
        }
    }

    @Override
    public void prepareToUse() {
        if (user == null) user = BeanManager.getUser();
        warningPanel = (GuestWarningPanel) BeanManager.getSubPanelBean(SubPanelType.GUEST_WARNING_PANEL);
        authPanel = (AuthorizationPanel) BeanManager.getSubPanelBean(SubPanelType.AUTH_PANEL);
        regPanel = (RegistrationPanel) BeanManager.getSubPanelBean(SubPanelType.REG_PANEL);
        warningPanel.prepareToUse();
        authPanel.prepareToUse();
        regPanel.prepareToUse();
        warningPanel.setSize(400, 244);
        warningPanel.setLocation(150, 230);
        authPanel.setSize(400, 324);
        authPanel.setLocation(150, 200);
        regPanel.setSize(400, 464);
        regPanel.setLocation(150, 140);
        add(warningPanel);
        add(authPanel);
        add(regPanel);
        focusablePanels.add(warningPanel);
        focusablePanels.add(authPanel);
        focusablePanels.add(regPanel);
        BeanManager.getButtonsController().setCurrentPanel(this);
        addButtons();
    }

    public void showSubButtons(boolean isVisible) {
        if (!isVisible) {
            authButton.setVisible(false);
            regButton.setVisible(false);
            enterGuestModeButton.setVisible(false);
            exitGuestModeButton.setVisible(false);
            return;
        }
        else if (user.getState() == UserState.GUEST_USER) exitGuestModeButton.setVisible(true);
        else enterGuestModeButton.setVisible(true);
        authButton.setVisible(true);
        regButton.setVisible(true);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        showSubButtons(false);
        if (buttonType == ButtonType.ENTER_GUEST_MODE || buttonType == ButtonType.EXIT_GUEST_MODE) {
            warningPanel.setVisible(true);
        } else if (buttonType == ButtonType.AUTHORIZATION) {
            authPanel.setVisible(true);
        } else if (buttonType == ButtonType.REGISTRATION) {
            regPanel.setVisible(true);
        }
    }

    @Override
    public void recycle() {
        for (Focusable focusablePanel : focusablePanels) {
            focusablePanel.unfocus();
        }
        focusablePanels.clear();
    }
}
