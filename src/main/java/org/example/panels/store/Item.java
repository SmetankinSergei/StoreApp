package org.example.panels.store;

import org.example.buttons.ButtonType;
import org.example.buttons.SimpleButton;
import org.example.panels.SamplePanel;
import org.example.panels.SubPanelType;
import org.example.panels.store.search.SearchOptionsPanel;
import org.example.service.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.awt.*;

@Component
@Scope("prototype")
@Entity
@Table(name = "books_store")
public class Item extends SamplePanel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "genre")
    private String genre;

    @Column(name = "author")
    private String author;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "amount")
    private int amount;

    public Item(String genre, String author, String name, int price, int amount) {
        this.genre = genre;
        this.author = author;
        this.name = name;
        this.price = price;
        this.amount = amount;
        addButtons(false);
    }

    public Item() {
        addButtons(false);
    }

    public void addButtons(boolean isInCart) {
        removeAll();
        SimpleButton itemInfo = BeanManager.getSimpleButton();
        Dimensions infoButtonDimensions = new Dimensions(0, 164, 194, 40);
        addButton(itemInfo, ButtonType.ITEM_INFO, this, infoButtonDimensions);

        Dimensions addToCartButtonDimensions = new Dimensions(0, 202, 194, 40);
        SimpleButton addToCartButton = BeanManager.getSimpleButton();
        SimpleButton dropButton = BeanManager.getSimpleButton();
        if (isInCart) {
            addButton(addToCartButton, ButtonType.DROP_FROM_CART, this, addToCartButtonDimensions);
        } else {
            addButton(dropButton, ButtonType.ADD_TO_CART, this, addToCartButtonDimensions);
        }
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.ADD_TO_CART) {
            addButtons(true);
            BeanManager.getCart().addItemInCart(this);
            System.out.println(this.getName() + " добавлена. Всего книг = " + BeanManager.getCart().getItemsList().size());
        }
        else if (buttonType == ButtonType.DROP_FROM_CART) {
            addButtons(false);
            BeanManager.getCart().dropItemFromCart(this);
            System.out.println(this.getName() + " отменена. Всего книг = " + BeanManager.getCart().getItemsList().size());
        } else if (buttonType == ButtonType.ITEM_INFO) {
            ((ProductInfoPanel) BeanManager.getSubPanelBean(SubPanelType.PRODUCT_INFO_PANEL)).showProductInfo(true);
        }
        repaint();
        SearchOptionsPanel searchOptionsPanel = (SearchOptionsPanel) BeanManager.getSubPanelBean(SubPanelType.SEARCH_OPTIONS_PANEL);
        if (searchOptionsPanel.isVisible()) searchOptionsPanel.setVisible(false);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void showInfo(Graphics g) {
        Writer.writeNumber(id, this, 0, 4, 194, g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(ImagesManager.getItemPanelImg(), 0, 0, this);
        showInfo(g);
    }
}
