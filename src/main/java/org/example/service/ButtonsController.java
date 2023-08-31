package org.example.service;

import org.example.AppFrame;
import org.example.AppState;
import org.example.buttons.ButtonType;
import org.example.panels.*;
import org.example.panels.start.FormFieldPanel;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.stereotype.Component;

@Component
public class ButtonsController {

    AppFrame appFrame;
    SamplePanel currentPanel;
    FormFieldPanel formFieldPanel;

    public ButtonsController(AppFrame appFrame) {
        this.appFrame = appFrame;
    }

    public void changePanelAction(AppState appState) {
        if (currentPanel instanceof Recyclable) ((Recyclable) currentPanel).recycle();
        appFrame.updFrame(appState);
        currentPanel = BeanManager.getMainPanelBean(appState);
        if (currentPanel instanceof Fillable) ((Fillable) currentPanel).prepareToUse();
    }

    public void simpleButtonAction(ButtonType buttonType, SamplePanel ownerPanel) {
        if (buttonType == ButtonType.ENTER_PANEL) changePanelAction(AppState.START_PANEL);
        else if (buttonType == ButtonType.STORE_PANEL) changePanelAction(AppState.STORE_PANEL);
        else if (buttonType == ButtonType.CART_PANEL) changePanelAction(AppState.CART_PANEL);
        else if (buttonType == ButtonType.ORDERS_PANEL) changePanelAction(AppState.ORDERS_PANEL);
        else if (buttonType == ButtonType.CONTACT_PANEL) changePanelAction(AppState.CONTACT_PANEL);
        else if (buttonType == ButtonType.RECALLS_PANEL) changePanelAction(AppState.RECALLS_PANEL);
        else if (buttonType == ButtonType.EXIT_PANEL) changePanelAction(AppState.EXIT_PANEL);
        else ownerPanel.actionButton(buttonType);
    }

    public FormFieldPanel getFormFieldPanel() {
        return formFieldPanel;
    }

    public void setFormFieldPanel(FormFieldPanel formFieldPanel) {
        this.formFieldPanel = formFieldPanel;
    }

    public void type(char keyChar, int keyCode) {
        System.out.println(keyChar);
        if (formFieldPanel != null) formFieldPanel.type(keyChar, keyCode);
    }

    public SamplePanel getCurrentPanel() {
        return currentPanel;
    }

    public void setCurrentPanel(SamplePanel currentPanel) {
        this.currentPanel = currentPanel;
    }
}
