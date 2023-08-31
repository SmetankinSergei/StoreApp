package org.example.panels;

import org.example.buttons.ButtonType;
import org.example.buttons.SimpleButton;
import org.example.panels.start.BlockPanel;
import org.example.panels.start.BlockPanelState;
import org.example.service.BeanManager;
import org.example.service.Dimensions;

public abstract class MainPanel extends SamplePanel {

    SimpleButton enterPanelButton;
    SimpleButton storePanelButton;
    SimpleButton cartPanelButton;
    SimpleButton ordersPanelButton;
    SimpleButton contactPanelButton;
    SimpleButton recallsPanelButton;
    SimpleButton exitPanelButton;

    public void addPanelsButtons() {
        enterPanelButton = BeanManager.getSimpleButton();
        storePanelButton = BeanManager.getSimpleButton();
        cartPanelButton = BeanManager.getSimpleButton();
        ordersPanelButton = BeanManager.getSimpleButton();
        contactPanelButton = BeanManager.getSimpleButton();
        recallsPanelButton = BeanManager.getSimpleButton();
        exitPanelButton = BeanManager.getSimpleButton();
        Dimensions enterPanelButtonDimensions = new Dimensions(2, 2, 97, 38);
        Dimensions storePanelButtonDimensions = new Dimensions(101, 2, 98, 38);
        Dimensions cartPanelButtonDimensions = new Dimensions(201, 2, 98, 38);
        Dimensions ordersPanelButtonDimensions = new Dimensions(301, 2, 98, 38);
        Dimensions contactPanelButtonDimensions = new Dimensions(401, 2, 98, 38);
        Dimensions recallsPanelButtonDimensions = new Dimensions(501, 2, 98, 38);
        Dimensions exitPanelButtonDimensions = new Dimensions(601, 2, 97, 38);
        addButton(enterPanelButton, ButtonType.ENTER_PANEL, this, enterPanelButtonDimensions);
        addButton(storePanelButton, ButtonType.STORE_PANEL, this, storePanelButtonDimensions);
        addButton(cartPanelButton, ButtonType.CART_PANEL, this, cartPanelButtonDimensions);
        addButton(ordersPanelButton, ButtonType.ORDERS_PANEL, this, ordersPanelButtonDimensions);
        addButton(contactPanelButton, ButtonType.CONTACT_PANEL, this, contactPanelButtonDimensions);
        addButton(recallsPanelButton, ButtonType.RECALLS_PANEL, this, recallsPanelButtonDimensions);
        addButton(exitPanelButton, ButtonType.EXIT_PANEL, this, exitPanelButtonDimensions);
        repaint();
    }

    public void hideButtonsBeforeAuth() {
        enterPanelButton.setVisible(true);
        storePanelButton.setVisible(false);
        cartPanelButton.setVisible(false);
        ordersPanelButton.setVisible(false);
        contactPanelButton.setVisible(false);
        recallsPanelButton.setVisible(false);
        exitPanelButton.setVisible(true);
        BlockPanel blockPanel = (BlockPanel) BeanManager.getSubPanelBean(SubPanelType.BLOCK_PANEL);
        add(blockPanel);
        blockPanel.setLocation(101, 2);
    }

    public void hideButtonsFromGuest() {
        enterPanelButton.setVisible(true);
        storePanelButton.setVisible(true);
        cartPanelButton.setVisible(true);
        ordersPanelButton.setVisible(false);
        contactPanelButton.setVisible(false);
        recallsPanelButton.setVisible(false);
        exitPanelButton.setVisible(true);
        BlockPanel blockPanel = (BlockPanel) BeanManager.getSubPanelBean(SubPanelType.BLOCK_PANEL);
        blockPanel.setState(BlockPanelState.BLOCK_FOR_GUEST);
        add(blockPanel);
        blockPanel.setLocation(301, 2);
    }

    public void uncoverButtons() {
        enterPanelButton.setVisible(true);
        storePanelButton.setVisible(true);
        cartPanelButton.setVisible(true);
        ordersPanelButton.setVisible(true);
        contactPanelButton.setVisible(true);
        recallsPanelButton.setVisible(true);
        exitPanelButton.setVisible(true);
    }

    @Override
    public void actionButton(ButtonType buttonType) {

    }
}
