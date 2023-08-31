package org.example.panels.start;

import org.example.AppState;
import org.example.buttons.SimpleButton;
import org.example.panels.Fillable;
import org.example.panels.Focusable;
import org.example.panels.SamplePanel;
import org.example.service.BeanManager;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class SubStartPanel extends SamplePanel implements Fillable, Focusable {

    FormFieldPanel loginPanel;
    FormFieldPanel passwordPanel;

    SimpleButton confirmButton;
    SimpleButton backButton;
    protected List<Focusable> formFieldsList = new ArrayList<>();

    public SubStartPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                for (Focusable focusablePanel : formFieldsList) {
                    if (checkOverBoardCoordinates(e, focusablePanel)) {
                        focusablePanel.unfocus();
                    } else {
                        ((FormFieldPanel) focusablePanel).setVisible(true);
                        BeanManager.getButtonsController().setFormFieldPanel((FormFieldPanel) focusablePanel);
                    }
                }
            }
        });
        setVisible(false);
    }

    private boolean checkOverBoardCoordinates(MouseEvent e, Focusable panel) {
        return  (e.getX() < ((JPanel) panel).getX() || e.getX() > ((JPanel) panel).getX() + ((JPanel) panel).getWidth() ||
                e.getY() < ((JPanel) panel).getY() || e.getY() > ((JPanel) panel).getY() + ((JPanel) panel).getHeight());
    }

    protected abstract void addButtons();

    @Override
    public void prepareToUse() {
        loginPanel = new TextFieldPanel();
        passwordPanel = new PasswordPanel();
        add(loginPanel);
        add(passwordPanel);
        loginPanel.setLocation(44, 44);
        passwordPanel.setLocation(44, 104);
        formFieldsList.add(loginPanel);
        formFieldsList.add(passwordPanel);
        addButtons();
    }

    @Override
    public void unfocus() {
        setVisible(false);
        for (Focusable focusable : formFieldsList) {
            ((FormFieldPanel) focusable).getTextFieldSymbols().clear();
            ((FormFieldPanel) focusable).getTextFieldSymbols().add(' ');
            focusable.unfocus();
        }
        ((StartPanel) BeanManager.getMainPanelBean(AppState.START_PANEL)).showSubButtons(true);
    }
}
