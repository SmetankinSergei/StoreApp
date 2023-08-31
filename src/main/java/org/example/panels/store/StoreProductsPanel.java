package org.example.panels.store;

import org.example.buttons.ButtonType;
import org.example.panels.Fillable;
import org.example.panels.SamplePanel;
import org.example.panels.SubPanelType;
import org.example.panels.store.search.SearchOptionsPanel;
import org.example.service.*;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class StoreProductsPanel extends SamplePanel implements Fillable {

    private List<Item> itemsList = new ArrayList<>();
    private int pageNumber = 1;
    private final JPanel itemsPanel;

    public StoreProductsPanel() {
        setSize(700, 600);
        itemsPanel = new JPanel();
        itemsPanel.setLayout(null);
        itemsPanel.setBackground(Color.white);
        itemsPanel.setSize(620, 502);
        itemsPanel.setLocation(40, 78);
        add(itemsPanel);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        arrowButtonAction(buttonType);
    }

    public void fillItemsList() {
        itemsList = BeanManager.getDAO().fillItemsList(pageNumber);
    }

    private void addStoreButtons() {
        Dimensions pageDownButtonDimensions = new Dimensions(476, 20, 38, 38);
        Dimensions pageUpButtonDimensions = new Dimensions(620, 20, 38, 38);
        addButton(BeanManager.getSimpleButton(), ButtonType.PAGE_DOWN, this, pageDownButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.PAGE_UP, this, pageUpButtonDimensions);
    }

    private void arrowButtonAction(ButtonType buttonType) {
        if (buttonType == ButtonType.PAGE_DOWN && pageNumber > 1) pageNumber--;
        else if (buttonType == ButtonType.PAGE_UP) pageNumber++;
        itemsList.clear();
        fillItemsList();
        if (itemsList.size() == 0) {
            pageNumber--;
            return;
        }
        addItemsOnPanel();
        ViewRepair.repair();
        SearchOptionsPanel searchOptionsPanel = (SearchOptionsPanel) BeanManager.getSubPanelBean(SubPanelType.SEARCH_OPTIONS_PANEL);
        if (searchOptionsPanel.isVisible()) searchOptionsPanel.setVisible(false);
        checkCart();
    }

    private void checkCart() {
        List<Item> cartList = BeanManager.getCart().getItemsList();
        if (cartList.size() > 0) {
            for (Item item : itemsList) {
                for (Item cartItem : cartList) {
                    if (cartItem.getId() == item.getId()) item.addButtons(true);
                }
            }
        }
    }

    private void addItemsOnPanel() {
        itemsPanel.removeAll();
        repaint();

        int itemsInPage = itemsList.size();
        int itemsInLineCount = 0;
        int lineCount = 0;
        for (int i = 0; i < itemsInPage; i++) {
            itemsPanel.add(itemsList.get(i));
            itemsList.get(i).setSize(194, 242);
            itemsList.get(i).setLocation(itemsInLineCount * 213, lineCount * 260);
            itemsInLineCount++;
            if (itemsInLineCount > 2) {
                itemsInLineCount = 0;
                lineCount++;
                if (lineCount > 1) lineCount = 0;
            }
        }
    }

    @Override
    public void prepareToUse() {
        addStoreButtons();
        fillItemsList();
        addItemsOnPanel();
        checkCart();
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    private void printPageNumber(Graphics g) {
        Writer.writeNumber(pageNumber, this, 536, 28, 62, g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        printPageNumber(g);
    }
}
