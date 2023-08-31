package org.example.service;

import org.example.AppState;
import org.example.panels.cart.CartPanel;
import org.example.panels.start.StartPanel;
import org.example.panels.store.StorePanel;

public class ViewRepair {

    public static void repair() {
        if (BeanManager.getButtonsController().getCurrentPanel() instanceof StartPanel) {
            BeanManager.getButtonsController().changePanelAction(AppState.START_PANEL);
        } else if (BeanManager.getButtonsController().getCurrentPanel() instanceof StorePanel) {
            BeanManager.getButtonsController().changePanelAction(AppState.STORE_PANEL);
        } else if (BeanManager.getButtonsController().getCurrentPanel() instanceof CartPanel) {
            BeanManager.getButtonsController().changePanelAction(AppState.CART_PANEL);
        }
    }
}
