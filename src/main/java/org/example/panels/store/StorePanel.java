package org.example.panels.store;

import org.example.buttons.ButtonType;
import org.example.panels.*;
import org.example.panels.store.search.SearchOptionsPanel;
import org.example.panels.store.search.SearchPanel;
import org.example.service.BeanManager;
import org.springframework.stereotype.Component;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

@Component
public class StorePanel extends MainPanel implements Fillable, Recyclable {

    List<Item> items;
    SearchOptionsPanel searchOptionsPanel;
    List<Focusable> focusablePanels = new ArrayList<>();
    StorePanelState state = StorePanelState.ALL_ITEMS;

    public StorePanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                for (Focusable focusablePanel : focusablePanels) {
                    focusablePanel.unfocus();
                }
            }
        });
    }

    public void addProducts() {
        StoreProductsPanel storeProductsPanel = (StoreProductsPanel) BeanManager.getSubPanelBean(SubPanelType.STORE_PRODUCTS_PANEL);
        SearchPanel searchPanel = (SearchPanel) BeanManager.getSubPanelBean(SubPanelType.SEARCH_PANEL);
        searchOptionsPanel = (SearchOptionsPanel) BeanManager.getSubPanelBean(SubPanelType.SEARCH_OPTIONS_PANEL);
        storeProductsPanel.prepareToUse();
        searchPanel.prepareToUse();
        storeProductsPanel.setVisible(true);
        searchPanel.setVisible(true);
        searchOptionsPanel.prepareToUse();
        storeProductsPanel.setLocation(0, 100);
        searchPanel.setLocation(0, 60);
        searchOptionsPanel.setLocation(128, 98);
        add(storeProductsPanel);
        add(searchPanel);
        add(searchOptionsPanel);
        ProductInfoPanel productInfoPanel = (ProductInfoPanel) BeanManager.getSubPanelBean(SubPanelType.PRODUCT_INFO_PANEL);
        add(productInfoPanel);
        productInfoPanel.prepareToUse();
        productInfoPanel.setLocation(0, 40);
        productInfoPanel.setVisible(false);
        focusablePanels.add(searchPanel);
        focusablePanels.add(searchOptionsPanel);
        focusablePanels.add(productInfoPanel);
    }

    public void showSearchOptions() {
        searchOptionsPanel.setVisible(!searchOptionsPanel.isVisible());
    }

    @Override
    public void prepareToUse() {
        addProducts();
    }

    @Override
    public void recycle() {
        StoreProductsPanel storeProductsPanel = (StoreProductsPanel) BeanManager.getSubPanelBean(SubPanelType.STORE_PRODUCTS_PANEL);
        if (searchOptionsPanel.isVisible()) searchOptionsPanel.setVisible(false);
        storeProductsPanel.getItemsList().clear();
        focusablePanels.clear();
    }

    public void setState(StorePanelState state) {
        this.state = state;
    }

    @Override
    public void actionButton(ButtonType buttonType) {

    }
}
