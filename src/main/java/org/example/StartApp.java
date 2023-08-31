package org.example;

import org.example.panels.*;
import org.example.service.BeanManager;
import org.example.service.ImagesManager;

import java.util.ArrayList;
import java.util.List;

public class StartApp {

    static List<MainPanel> mainPanelsList = new ArrayList<>();

    public static void main(String[] args) {
        ImagesManager.loadImages();
        BeanManager.getAppFrame();
        MainPanel startPanel = (MainPanel) BeanManager.getMainPanelBean(AppState.START_PANEL);
        MainPanel storePanel = (MainPanel) BeanManager.getMainPanelBean(AppState.STORE_PANEL);
        MainPanel cartPanel = (MainPanel) BeanManager.getMainPanelBean(AppState.CART_PANEL);
        MainPanel ordersPanel = (MainPanel) BeanManager.getMainPanelBean(AppState.ORDERS_PANEL);
        MainPanel contactPanel = (MainPanel) BeanManager.getMainPanelBean(AppState.CONTACT_PANEL);
        MainPanel recallsPanel = (MainPanel) BeanManager.getMainPanelBean(AppState.RECALLS_PANEL);
        MainPanel exitPanel = (MainPanel) BeanManager.getMainPanelBean(AppState.EXIT_PANEL);
        mainPanelsList.add(startPanel);
        mainPanelsList.add(storePanel);
        mainPanelsList.add(cartPanel);
        mainPanelsList.add(ordersPanel);
        mainPanelsList.add(contactPanel);
        mainPanelsList.add(recallsPanel);
        mainPanelsList.add(exitPanel);
        for (MainPanel mainPanel : mainPanelsList) {
            mainPanel.addPanelsButtons();
            mainPanel.hideButtonsBeforeAuth();
        }
    }

    public static List<MainPanel> getMainPanelsList() {
        return mainPanelsList;
    }
}
