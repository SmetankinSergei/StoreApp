package org.example.panels.store.search;

import org.example.AppState;
import org.example.buttons.ButtonType;
import org.example.panels.Fillable;
import org.example.panels.Focusable;
import org.example.panels.start.FormFieldPanel;
import org.example.panels.start.SubStartPanel;
import org.example.panels.store.StorePanel;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.example.service.ImagesManager;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.image.BufferedImage;

@Component
public class SearchPanel extends SubStartPanel implements Fillable, Focusable {

    BufferedImage image;
    TypeSearchRequest typeSearchRequest = TypeSearchRequest.ALL;
    FormFieldPanel searchFieldPanel;

    public SearchPanel() {
        setSize(700, 40);
    }

    @Override
    protected void addButtons() {

    }

    public void setTypeSearchRequest(TypeSearchRequest typeSearchRequest) {
        this.typeSearchRequest = typeSearchRequest;
        repaint();
    }

    @Override
    public void prepareToUse() {
        searchFieldPanel = new SearchTextFieldPanel();
        add(searchFieldPanel);
        searchFieldPanel.setSize(458, 36);
        searchFieldPanel.setLocation(162, 2);
        formFieldsList.add(searchFieldPanel);
        Dimensions searchButtonDimensions = new Dimensions(622, 2, 36, 36);
        Dimensions searchOptionsButtonDimensions = new Dimensions(130, 2, 30, 36);
        addButton(BeanManager.getSimpleButton(), ButtonType.SEARCH, this, searchButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.SEARCH_OPTIONS, this, searchOptionsButtonDimensions);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        if (buttonType == ButtonType.SEARCH) ;
        else if (buttonType == ButtonType.SEARCH_OPTIONS) {
            ((StorePanel) BeanManager.getMainPanelBean(AppState.STORE_PANEL)).showSearchOptions();
        } else throw new RuntimeException("From SearchPanel.actionButton: unknown button type: " + buttonType);
    }

    private void setImage(TypeSearchRequest typeSearchRequest) {
        if (typeSearchRequest == TypeSearchRequest.AUTHOR) image = ImagesManager.getAuthorSearchLabelImg();
        else if (typeSearchRequest == TypeSearchRequest.BOOK) image = ImagesManager.getBookSearchLabelImg();
        else if (typeSearchRequest == TypeSearchRequest.GENRE) image = ImagesManager.getGenreSearchLabelImg();
        else if (typeSearchRequest == TypeSearchRequest.ID) image = ImagesManager.getIdSearchLabelImg();
        else if (typeSearchRequest == TypeSearchRequest.ALL) image = ImagesManager.getAllSearchLabelImg();
    }

    @Override
    protected void paintComponent(Graphics g) {
        setImage(typeSearchRequest);
        g.drawImage(image, 42, 2, this);
    }
}
