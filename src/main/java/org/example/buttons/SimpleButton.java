package org.example.buttons;

import org.example.panels.SamplePanel;
import org.example.service.ButtonsController;
import org.example.service.ImagesManager;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@Component
@Scope("prototype")
public class SimpleButton extends JPanel implements MouseListener {

    SamplePanel ownerPanel;
    ButtonType buttonType;
    ButtonState buttonState = ButtonState.SIMPLE;
    ButtonsController buttonsController;

    public SimpleButton(ButtonsController buttonsController) {
        this.buttonsController = buttonsController;
        setBackground(Color.green);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (buttonState == ButtonState.SIMPLE) {
            // main buttons
            if (buttonType == ButtonType.ENTER_PANEL) g.drawImage(ImagesManager.getEnterButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.STORE_PANEL) g.drawImage(ImagesManager.getStoreButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CART_PANEL) g.drawImage(ImagesManager.getCartButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ORDERS_PANEL) g.drawImage(ImagesManager.getOrdersButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONTACT_PANEL) g.drawImage(ImagesManager.getContactButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.RECALLS_PANEL) g.drawImage(ImagesManager.getRecallsButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.EXIT_PANEL) g.drawImage(ImagesManager.getExitButtonImg(), 0, 0, this);
            // start panel
            else if (buttonType == ButtonType.AUTHORIZATION) g.drawImage(ImagesManager.getAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.REGISTRATION) g.drawImage(ImagesManager.getRegButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ENTER_GUEST_MODE) g.drawImage(ImagesManager.getGuestButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.EXIT_GUEST_MODE) g.drawImage(ImagesManager.getExitGuestModeButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_AUTH) g.drawImage(ImagesManager.getConfirmButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.BACK_FROM_AUTH) g.drawImage(ImagesManager.getBackFromAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_REG) g.drawImage(ImagesManager.getConfirmButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.BACK_FROM_REG) g.drawImage(ImagesManager.getBackFromAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GUEST_NO) g.drawImage(ImagesManager.getGuestNoButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GUEST_YES) g.drawImage(ImagesManager.getGuestYesButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_EXIT_GUEST_MODE) g.drawImage(ImagesManager.getGuestYesButtonImg(), 0, 0, this);
            // store panel buttons
            else if (buttonType == ButtonType.STORE_SETTINGS) g.drawImage(ImagesManager.getSettingsButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.PAGE_DOWN) g.drawImage(ImagesManager.getLeftArrowButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.PAGE_UP) g.drawImage(ImagesManager.getRightArrowButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CLOSE_PRODUCT_INFO) g.drawImage(ImagesManager.getCloseProductInfoButtonImg(), 0, 0, this);
            // cart panel buttons
            else if (buttonType == ButtonType.BUY) g.drawImage(ImagesManager.getBuyButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.DROP_ALL) g.drawImage(ImagesManager.getDropAllButtonImg(), 0, 0, this);
            // item panel buttons
            else if (buttonType == ButtonType.ITEM_INFO) g.drawImage(ImagesManager.getProductInfoButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ADD_TO_CART) g.drawImage(ImagesManager.getAddButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.DROP_FROM_CART) g.drawImage(ImagesManager.getDropButtonImg(), 0, 0, this);
            // search panel
            else if (buttonType == ButtonType.SEARCH) g.drawImage(ImagesManager.getSearchButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.SEARCH_OPTIONS) g.drawImage(ImagesManager.getSearchOptionsButtonImg(), 0, 0, this);
            // search options panel
            else if (buttonType == ButtonType.BOOK_OPTION) g.drawImage(ImagesManager.getBookButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.AUTHOR_OPTION) g.drawImage(ImagesManager.getAuthorButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GENRE_OPTION) g.drawImage(ImagesManager.getGenreButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ID_OPTION) g.drawImage(ImagesManager.getIdButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ALL_OPTION) g.drawImage(ImagesManager.getAllButtonImg(), 0, 0, this);
        } else if (buttonState == ButtonState.ACTIVE) {
            // main buttons
            if (buttonType == ButtonType.ENTER_PANEL) g.drawImage(ImagesManager.getActiveEnterButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.STORE_PANEL) g.drawImage(ImagesManager.getActiveStoreButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CART_PANEL) g.drawImage(ImagesManager.getActiveCartButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ORDERS_PANEL) g.drawImage(ImagesManager.getActiveOrdersButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONTACT_PANEL) g.drawImage(ImagesManager.getActiveContactButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.RECALLS_PANEL) g.drawImage(ImagesManager.getActiveRecallsButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.EXIT_PANEL) g.drawImage(ImagesManager.getActiveExitButtonImg(), 0, 0, this);
            // start panel
            else if (buttonType == ButtonType.AUTHORIZATION) g.drawImage(ImagesManager.getActiveAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.REGISTRATION) g.drawImage(ImagesManager.getActiveRegButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ENTER_GUEST_MODE) g.drawImage(ImagesManager.getActiveGuestButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.EXIT_GUEST_MODE) g.drawImage(ImagesManager.getActiveExitGuestModeButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_AUTH) g.drawImage(ImagesManager.getActiveConfirmButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.BACK_FROM_AUTH) g.drawImage(ImagesManager.getActiveBackFromAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_REG) g.drawImage(ImagesManager.getActiveConfirmButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.BACK_FROM_REG) g.drawImage(ImagesManager.getActiveBackFromAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GUEST_NO) g.drawImage(ImagesManager.getActiveGuestNoButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GUEST_YES) g.drawImage(ImagesManager.getActiveGuestYesButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_EXIT_GUEST_MODE) g.drawImage(ImagesManager.getActiveGuestYesButtonImg(), 0, 0, this);
            // store panel buttons
            else if (buttonType == ButtonType.STORE_SETTINGS) g.drawImage(ImagesManager.getActiveSettingsButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.PAGE_DOWN) g.drawImage(ImagesManager.getActiveLeftArrowButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.PAGE_UP) g.drawImage(ImagesManager.getActiveRightArrowButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CLOSE_PRODUCT_INFO) g.drawImage(ImagesManager.getActiveCloseProductInfoButtonImg(), 0, 0, this);
            // cart panel buttons
            else if (buttonType == ButtonType.BUY) g.drawImage(ImagesManager.getActiveBuyButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.DROP_ALL) g.drawImage(ImagesManager.getActiveDropAllButtonImg(), 0, 0, this);
            // item panel buttons
            else if (buttonType == ButtonType.ITEM_INFO) g.drawImage(ImagesManager.getActiveProductInfoButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ADD_TO_CART) g.drawImage(ImagesManager.getActiveAddButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.DROP_FROM_CART) g.drawImage(ImagesManager.getActiveDropButtonImg(), 0, 0, this);
            // search panel
            else if (buttonType == ButtonType.SEARCH) g.drawImage(ImagesManager.getActiveSearchButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.SEARCH_OPTIONS) g.drawImage(ImagesManager.getActiveSearchOptionsButtonImg(), 0, 0, this);
            // search options panel
            else if (buttonType == ButtonType.BOOK_OPTION) g.drawImage(ImagesManager.getActiveBookButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.AUTHOR_OPTION) g.drawImage(ImagesManager.getActiveAuthorButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GENRE_OPTION) g.drawImage(ImagesManager.getActiveGenreButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ID_OPTION) g.drawImage(ImagesManager.getActiveIdButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ALL_OPTION) g.drawImage(ImagesManager.getActiveAllButtonImg(), 0, 0, this);
        } else if (buttonState == ButtonState.PRESSED) {
            // main buttons
            if (buttonType == ButtonType.ENTER_PANEL) g.drawImage(ImagesManager.getPressedEnterButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.STORE_PANEL) g.drawImage(ImagesManager.getPressedStoreButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CART_PANEL) g.drawImage(ImagesManager.getPressedCartButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ORDERS_PANEL) g.drawImage(ImagesManager.getPressedOrdersButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONTACT_PANEL) g.drawImage(ImagesManager.getPressedContactButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.RECALLS_PANEL) g.drawImage(ImagesManager.getPressedRecallsButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.EXIT_PANEL) g.drawImage(ImagesManager.getPressedExitButtonImg(), 0, 0, this);
            // start panel
            else if (buttonType == ButtonType.AUTHORIZATION) g.drawImage(ImagesManager.getPressedAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.REGISTRATION) g.drawImage(ImagesManager.getPressedRegButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ENTER_GUEST_MODE) g.drawImage(ImagesManager.getPressedGuestButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.EXIT_GUEST_MODE) g.drawImage(ImagesManager.getPressedExitGuestModeButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_AUTH) g.drawImage(ImagesManager.getPressedConfirmButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.BACK_FROM_AUTH) g.drawImage(ImagesManager.getPressedBackFromAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_REG) g.drawImage(ImagesManager.getPressedConfirmButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.BACK_FROM_REG) g.drawImage(ImagesManager.getPressedBackFromAuthButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GUEST_NO) g.drawImage(ImagesManager.getPressedGuestNoButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GUEST_YES) g.drawImage(ImagesManager.getPressedGuestYesButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CONFIRM_EXIT_GUEST_MODE) g.drawImage(ImagesManager.getPressedGuestYesButtonImg(), 0, 0, this);
            // store panel buttons
            else if (buttonType == ButtonType.STORE_SETTINGS) g.drawImage(ImagesManager.getPressedSettingsButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.PAGE_DOWN) g.drawImage(ImagesManager.getPressedLeftArrowButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.PAGE_UP) g.drawImage(ImagesManager.getPressedRightArrowButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.CLOSE_PRODUCT_INFO) g.drawImage(ImagesManager.getPressedCloseProductInfoButtonImg(), 0, 0, this);
            // cart panel buttons
            else if (buttonType == ButtonType.BUY) g.drawImage(ImagesManager.getPressedBuyButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.DROP_ALL) g.drawImage(ImagesManager.getPressedDropAllButtonImg(), 0, 0, this);
            // item panel buttons
            else if (buttonType == ButtonType.ITEM_INFO) g.drawImage(ImagesManager.getPressedProductInfoButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ADD_TO_CART) g.drawImage(ImagesManager.getPressedAddButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.DROP_FROM_CART) g.drawImage(ImagesManager.getPressedDropButtonImg(), 0, 0, this);
            // search panel
            else if (buttonType == ButtonType.SEARCH) g.drawImage(ImagesManager.getPressedSearchButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.SEARCH_OPTIONS) g.drawImage(ImagesManager.getPressedSearchOptionsButtonImg(), 0, 0, this);
            // search options panel
            else if (buttonType == ButtonType.BOOK_OPTION) g.drawImage(ImagesManager.getPressedBookButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.AUTHOR_OPTION) g.drawImage(ImagesManager.getPressedAuthorButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.GENRE_OPTION) g.drawImage(ImagesManager.getPressedGenreButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ID_OPTION) g.drawImage(ImagesManager.getPressedIdButtonImg(), 0, 0, this);
            else if (buttonType == ButtonType.ALL_OPTION) g.drawImage(ImagesManager.getPressedAllButtonImg(), 0, 0, this);
        }
    }

    boolean checkCoordinates(MouseEvent e) {
        return e.getX() >= 0 && e.getX() <= getWidth() && e.getY() >= 0 && e.getY() <= getHeight();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        buttonState = ButtonState.SIMPLE;
        if (buttonType == ButtonType.START_APP && checkCoordinates(e)) ownerPanel.actionButton(buttonType);
        else if (checkCoordinates(e)) buttonsController.simpleButtonAction(buttonType, ownerPanel);
        repaint();
    }

    public void setButtonType(ButtonType buttonType) {
        this.buttonType = buttonType;
    }

    public void setOwnerPanel(SamplePanel ownerPanel) {
        this.ownerPanel = ownerPanel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        buttonState = ButtonState.PRESSED;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        buttonState = ButtonState.ACTIVE;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        buttonState = ButtonState.SIMPLE;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}

