package org.example.panels.cart;

import org.example.buttons.ButtonType;
import org.example.panels.Fillable;
import org.example.panels.SamplePanel;
import org.example.panels.store.Item;
import org.example.service.*;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

@Component
public class CartProductsPanel extends SamplePanel implements Fillable {

    int itemsListSize = 0;
    private int pageNumber = 1;
    BufferedImage cartProductsPanelImg;
    List<Item> cartList;

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.DROP_ALL) {
            BeanManager.getCart().getItemsList().clear();
            ViewRepair.repair();
        } else if (buttonType == ButtonType.PAGE_UP || buttonType == ButtonType.PAGE_DOWN) {
            arrowButtonAction(buttonType);
        }
    }

    private void arrowButtonAction(ButtonType buttonType) {
        int maxPageNum = cartList.size() / 6;
        if (cartList.size() % 6 != 0) maxPageNum++;
        if (buttonType == ButtonType.PAGE_DOWN && pageNumber > 1) pageNumber--;
        else if (buttonType == ButtonType.PAGE_UP && pageNumber < maxPageNum) pageNumber++;
        prepareToUse();
        ViewRepair.repair();
    }

    @Override
    public void prepareToUse() {
        this.removeAll();
        repaint();

        cartList = BeanManager.getCart().getItemsList();

        if (cartList.size() > 0 && cartList.size() % 6 == 0) {
            int maxPageNumber = cartList.size() / 6;
            if (pageNumber > maxPageNumber) pageNumber = maxPageNumber;
        }
        itemsListSize = cartList.size();
        if (itemsListSize > 0) {
            addItemsOnPanel();
            addButtons();
        } else {
            cartProductsPanelImg = ImagesManager.getEmptyCartProductsPanel();
        }
    }

    public void addItemsOnPanel() {
        cartProductsPanelImg = ImagesManager.getFilledCartProductsPanel();
        int startIndex = pageNumber * 6 - 6;
        int maxIndex = startIndex + 6;
        int countItemsInLine = 0;
        int lineNumber = 0;
        
        for (int i = startIndex; i < maxIndex; i++) {
            if (i < cartList.size()) {
                Item item = cartList.get(i);
                this.add(item);
                int x = 40 + countItemsInLine * 213;
                int y = 80 + lineNumber * 260;
                countItemsInLine++;
                if (countItemsInLine > 2) {
                    countItemsInLine = 0;
                    lineNumber++;
                }
                item.setLocation(x, y);
            }
        }

        repaint();
        setSize(700, 660);
        setLocation(0, 40);
    }

    private void addButtons() {
        Dimensions pageDownButtonDimensions = new Dimensions(476, 22, 38, 38);
        Dimensions pageUpButtonDimensions = new Dimensions(620, 22, 38, 38);
        Dimensions buyButtonDimensions = new Dimensions(359, 600, 141, 40);
        Dimensions dropAllButtonDimensions = new Dimensions(518, 600, 142, 40);
        addButton(BeanManager.getSimpleButton(), ButtonType.PAGE_DOWN, this, pageDownButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.PAGE_UP, this, pageUpButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.BUY, this, buyButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.DROP_ALL, this, dropAllButtonDimensions);
    }

    private void printPageNumber(Graphics g) {
        Writer.writeNumber(pageNumber, this, 536, 30, 62, g);
    }

    private void printTotalPrice(Graphics g) {
        int totalPrice = 0;
        for (Item item : cartList) totalPrice += item.getPrice();
        Writer.writeNumber(totalPrice, this, 180, 609, 165, g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(cartProductsPanelImg, 0, 2, this);
        if (itemsListSize > 0) {
            printPageNumber(g);
            printTotalPrice(g);
        }
    }
}
