package org.example.panels.cart;

import org.example.panels.Fillable;
import org.example.panels.MainPanel;
import org.example.panels.Recyclable;
import org.example.panels.SubPanelType;
import org.example.panels.store.ProductInfoPanel;
import org.example.service.BeanManager;
import org.springframework.stereotype.Component;

@Component
public class CartPanel extends MainPanel implements Fillable, Recyclable {

    @Override
    public void prepareToUse() {
        CartProductsPanel cartProductsPanel = (CartProductsPanel) BeanManager.getSubPanelBean(SubPanelType.CART_PRODUCTS_PANEL);

        add(cartProductsPanel);
        cartProductsPanel.setLocation(0, 40);
        cartProductsPanel.prepareToUse();
        cartProductsPanel.setVisible(true);

        ProductInfoPanel productInfoPanel = (ProductInfoPanel) BeanManager.getSubPanelBean(SubPanelType.PRODUCT_INFO_PANEL);
        add(productInfoPanel);
        productInfoPanel.prepareToUse();
        productInfoPanel.setLocation(0, 40);
        productInfoPanel.setVisible(false);
    }

    @Override
    public void recycle() {

    }
}
