package org.example.panels.store.search;

import org.example.buttons.ButtonType;
import org.example.panels.Fillable;
import org.example.panels.Focusable;
import org.example.panels.SamplePanel;
import org.example.panels.SubPanelType;
import org.example.service.BeanManager;
import org.example.service.Dimensions;
import org.springframework.stereotype.Component;

@Component
public class SearchOptionsPanel extends SamplePanel implements Fillable, Focusable {

    boolean isVisible;

    public SearchOptionsPanel() {
        setSize(90, 192);
        setVisible(isVisible);
    }

    @Override
    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
        if (!isVisible()) setSize(0, 0);
        else setSize(90, 192);
        repaint();
    }

    public boolean isVisible() {
        return isVisible;
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        SearchPanel searchPanel = (SearchPanel) BeanManager.getSubPanelBean(SubPanelType.SEARCH_PANEL);
        if (buttonType == ButtonType.BOOK_OPTION) searchPanel.setTypeSearchRequest(TypeSearchRequest.BOOK);
        else if (buttonType == ButtonType.AUTHOR_OPTION) searchPanel.setTypeSearchRequest(TypeSearchRequest.AUTHOR);
        else if (buttonType == ButtonType.GENRE_OPTION) searchPanel.setTypeSearchRequest(TypeSearchRequest.GENRE);
        else if (buttonType == ButtonType.ID_OPTION) searchPanel.setTypeSearchRequest(TypeSearchRequest.ID);
        else if (buttonType == ButtonType.ALL_OPTION) searchPanel.setTypeSearchRequest(TypeSearchRequest.ALL);
        setVisible(false);
    }

    @Override
    public void prepareToUse() {
        Dimensions bookButtonDimensions = new Dimensions(2, 2, 86, 36);
        Dimensions authorButtonDimensions = new Dimensions(2, 40, 86, 36);
        Dimensions genreButtonDimensions = new Dimensions(2, 78, 86, 36);
        Dimensions idButtonDimensions = new Dimensions(2, 116, 86, 36);
        Dimensions allButtonDimensions = new Dimensions(2, 154, 86, 36);
        addButton(BeanManager.getSimpleButton(), ButtonType.BOOK_OPTION, this, bookButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.AUTHOR_OPTION, this, authorButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.GENRE_OPTION, this, genreButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.ID_OPTION, this, idButtonDimensions);
        addButton(BeanManager.getSimpleButton(), ButtonType.ALL_OPTION, this, allButtonDimensions);
    }

    @Override
    public void unfocus() {
        setVisible(false);
    }
}
