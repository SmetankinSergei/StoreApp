package org.example.panels.store;

import org.example.buttons.ButtonType;
import org.example.panels.Fillable;
import org.example.panels.Focusable;
import org.example.panels.SamplePanel;
import org.example.panels.SubPanelType;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.example.service.ViewRepair;
import org.springframework.stereotype.Component;

@Component
public class ProductInfoPanel extends SamplePanel implements Fillable, Focusable {

    public ProductInfoPanel() {
        setSize(700, 658);
    }

    public void showProductInfo(boolean showIt) {
        SamplePanel storeProductsPanel = BeanManager.getSubPanelBean(SubPanelType.STORE_PRODUCTS_PANEL);
        SamplePanel cartProductsPanel = BeanManager.getSubPanelBean(SubPanelType.CART_PRODUCTS_PANEL);
        SamplePanel searchPanel = BeanManager.getSubPanelBean(SubPanelType.SEARCH_PANEL);
        if (showIt) {
            storeProductsPanel.setVisible(false);
            cartProductsPanel.setVisible(false);
            searchPanel.setVisible(false);
            setVisible(true);
        } else {
            setVisible(false);
            storeProductsPanel.setVisible(true);
            cartProductsPanel.setVisible(true);
            searchPanel.setVisible(true);
            ViewRepair.repair();
        }
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.CLOSE_PRODUCT_INFO) showProductInfo(false);
    }

    @Override
    public void prepareToUse() {
        Dimensions closeButtonDimensions = new Dimensions(636, 20, 42, 42);
        addButton(BeanManager.getSimpleButton(), ButtonType.CLOSE_PRODUCT_INFO, this, closeButtonDimensions);
    }

    @Override
    public void unfocus() {
        showProductInfo(false);
    }
}
