package org.example.panels;

import org.example.AppState;
import org.example.buttons.ButtonType;
import org.example.buttons.SimpleButton;
import org.example.panels.cart.CartPanel;
import org.example.panels.start.AuthorizationPanel;
import org.example.panels.start.FormFieldPanel;
import org.example.panels.start.RegistrationPanel;
import org.example.panels.start.StartPanel;
import org.example.panels.store.*;
import org.example.panels.store.search.SearchOptionsPanel;
import org.example.panels.store.search.SearchPanel;
import org.example.service.Dimensions;
import org.example.service.ImagesManager;

import javax.swing.*;
import java.awt.*;

public abstract class SamplePanel extends JPanel {

    public SamplePanel() {
        setLayout(null);
    }

    private AppState checkAppState() {
        if (this instanceof StartPanel) return AppState.START_PANEL;
        else if (this instanceof StorePanel) return AppState.STORE_PANEL;
        else if (this instanceof CartPanel) return AppState.CART_PANEL;
        else if (this instanceof OrdersPanel) return AppState.ORDERS_PANEL;
        else if (this instanceof ContactPanel) return AppState.CONTACT_PANEL;
        else if (this instanceof RecallsPanel) return AppState.RECALLS_PANEL;
        else if (this instanceof ExitPanel) return AppState.EXIT_PANEL;
        throw new RuntimeException("From SamplePanel.checkAppState: unassigned panel");
    }

    public void addButton(SimpleButton button, ButtonType buttonType, SamplePanel ownerPanel, Dimensions dimensions) {
        button.setSize(dimensions.getWidth(), dimensions.getHeight());
        button.setLocation(dimensions.getX(), dimensions.getY());
        button.setButtonType(buttonType);
        button.setOwnerPanel(ownerPanel);
        add(button);
    }

    public abstract void actionButton(ButtonType buttonType);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this instanceof StartPanel) g.drawImage(ImagesManager.getStartPanelImg(), 0, 0, this);
        else if (this instanceof AuthorizationPanel) g.drawImage(ImagesManager.getAuthPanelImg(), 0, 0, this);
        else if (this instanceof RegistrationPanel) g.drawImage(ImagesManager.getRegPanelImg(), 0, 0, this);
        else if (this instanceof StorePanel) g.drawImage(ImagesManager.getStorePanelImg(), 0, 0, this);
        else if (this instanceof CartPanel) g.drawImage(ImagesManager.getCartPanelImg(), 0, 0, this);
        else if (this instanceof OrdersPanel) g.drawImage(ImagesManager.getOrdersPanelImg(), 0, 0, this);
        else if (this instanceof ContactPanel) g.drawImage(ImagesManager.getContactPanelImg(), 0, 0, this);
        else if (this instanceof RecallsPanel) g.drawImage(ImagesManager.getRecallsPanelImg(), 0, 0, this);
        else if (this instanceof ExitPanel) g.drawImage(ImagesManager.getExitPanelImg(), 0, 0, this);
        else if (this instanceof StoreProductsPanel) g.drawImage(ImagesManager.getProductsPanelImg(), 0, 0, this);
        else if (this instanceof SearchPanel) g.drawImage(ImagesManager.getSearchPanelImg(), 0, 0, this);
        else if (this instanceof Item) g.drawImage(ImagesManager.getItemPanelImg(), 0, 0, this);
        else if (this instanceof SearchOptionsPanel) g.drawImage(ImagesManager.getSearchOptionsPanelImg(), 0, 0, this);
        else if (this instanceof ProductInfoPanel) g.drawImage(ImagesManager.getProductInfoPanelImg(), 0, 0, this);
    }
}
