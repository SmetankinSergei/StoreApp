package org.example.panels.start;

import org.example.buttons.ButtonType;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.springframework.stereotype.Component;

@Component
public class RegistrationPanel extends SubStartPanel {

    FormFieldPanel emailPanel;
    FormFieldPanel phoneNumberPanel;

    @Override
    protected void addButtons() {
        if (confirmButton == null) confirmButton = BeanManager.getSimpleButton();
        if (backButton == null) backButton = BeanManager.getSimpleButton();
        Dimensions confirmButtonDimensions = new Dimensions(42, 322, 316, 40);
        Dimensions backButtonDimensions = new Dimensions(42, 382, 316, 40);
        addButton(confirmButton, ButtonType.CONFIRM_REG, this, confirmButtonDimensions);
        addButton(backButton, ButtonType.BACK_FROM_REG, this, backButtonDimensions);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.BACK_FROM_REG) unfocus();
    }

    @Override
    public void prepareToUse() {
        super.prepareToUse();
        emailPanel = new TextFieldPanel();
        phoneNumberPanel = new TextFieldPanel();
        add(emailPanel);
        add(phoneNumberPanel);
        emailPanel.setLocation(44, 164);
        phoneNumberPanel.setLocation(44, 224);
        formFieldsList.add(emailPanel);
        formFieldsList.add(phoneNumberPanel);
    }
}
