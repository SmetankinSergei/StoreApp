package org.example.panels.start;

import org.example.buttons.ButtonType;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class AuthorizationPanel extends SubStartPanel {

    FormFieldPanel loginPanel;
    FormFieldPanel passwordPanel;

    @Override
    protected void addButtons() {
        if (confirmButton == null) confirmButton = BeanManager.getSimpleButton();
        if (backButton == null) backButton = BeanManager.getSimpleButton();
        Dimensions confirmButtonDimensions = new Dimensions(42, 182, 316, 40);
        Dimensions backButtonDimensions = new Dimensions(42, 242, 316, 40);
        addButton(confirmButton, ButtonType.CONFIRM_AUTH, this, confirmButtonDimensions);
        addButton(backButton, ButtonType.BACK_FROM_AUTH, this, backButtonDimensions);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.BACK_FROM_AUTH) unfocus();
    }
}
