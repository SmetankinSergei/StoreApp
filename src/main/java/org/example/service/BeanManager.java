package org.example.service;

import org.example.AppFrame;
import org.example.AppState;
import org.example.Cart;
import org.example.Config;
import org.example.buttons.SimpleButton;
import org.example.panels.*;
import org.example.panels.cart.CartPanel;
import org.example.panels.cart.CartProductsPanel;
import org.example.panels.start.*;
import org.example.panels.store.*;
import org.example.panels.store.search.SearchOptionsPanel;
import org.example.panels.store.search.SearchPanel;
import org.example.user.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanManager {

    static AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(Config.class);

    public static SamplePanel getMainPanelBean(AppState appState) {
        if (appState == AppState.START_PANEL) return context.getBean("startPanel", StartPanel.class);
        else if (appState == AppState.STORE_PANEL) return context.getBean("storePanel", StorePanel.class);
        else if (appState == AppState.CART_PANEL) return context.getBean("cartPanel", CartPanel.class);
        else if (appState == AppState.ORDERS_PANEL) return context.getBean("ordersPanel", OrdersPanel.class);
        else if (appState == AppState.CONTACT_PANEL) return context.getBean("contactPanel", ContactPanel.class);
        else if (appState == AppState.RECALLS_PANEL) return context.getBean("recallsPanel", RecallsPanel.class);
        else if (appState == AppState.EXIT_PANEL) return context.getBean("exitPanel", ExitPanel.class);
        throw new RuntimeException("From BeanManager.getPanelBean: unknown bean type: " + appState);
    }

    public static SamplePanel getSubPanelBean(SubPanelType subPanelType) {
        if (subPanelType == SubPanelType.AUTH_PANEL) return context.getBean("authorizationPanel", AuthorizationPanel.class);
        else if (subPanelType == SubPanelType.REG_PANEL) return context.getBean("registrationPanel", RegistrationPanel.class);
        else if (subPanelType == SubPanelType.GUEST_WARNING_PANEL) return context.getBean("guestWarningPanel", GuestWarningPanel.class);
        else if (subPanelType == SubPanelType.BLOCK_PANEL) return context.getBean("blockPanel", BlockPanel.class);
        else if (subPanelType == SubPanelType.STORE_PRODUCTS_PANEL) return context.getBean("storeProductsPanel", StoreProductsPanel.class);
        else if (subPanelType == SubPanelType.SEARCH_PANEL) return context.getBean("searchPanel", SearchPanel.class);
        else if (subPanelType == SubPanelType.SEARCH_OPTIONS_PANEL) return context.getBean("searchOptionsPanel", SearchOptionsPanel.class);
        else if (subPanelType == SubPanelType.PRODUCT_INFO_PANEL) return context.getBean("productInfoPanel", ProductInfoPanel.class);
        else if (subPanelType == SubPanelType.CART_PRODUCTS_PANEL) return context.getBean("cartProductsPanel", CartProductsPanel.class);
        else throw new RuntimeException("From BeanManager.getSubPanelBean: unknown sub panel type: " + subPanelType);
    }

    public static SimpleButton getSimpleButton() {
        return context.getBean("simpleButton", SimpleButton.class);
    }

    public static AppFrame getAppFrame() {
        return context.getBean("appFrame", AppFrame.class);
    }

    public static ButtonsController getButtonsController() {
        return context.getBean("buttonsController", ButtonsController.class);
    }

    public static Cart getCart() {
        return context.getBean("cart", Cart.class);
    }

    public static DAO getDAO() {
        return context.getBean("DAO", DAO.class);
    }

    public static User getUser() {
        return context.getBean("user", User.class);
    }

    public static AnnotationConfigApplicationContext getContext() {
        return context;
    }
}
