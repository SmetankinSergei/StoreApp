package org.example.panels.start;

import org.example.panels.Focusable;
import org.example.panels.store.search.SearchTextFieldPanel;
import org.example.service.ImagesManager;
import org.example.service.Writer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FormFieldPanel extends JPanel implements Focusable {

    private String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 .";
    private List<Character> textFieldSymbols = new ArrayList<>();

    public FormFieldPanel() {
        setSize(312, 36);
        textFieldSymbols.add(' ');
        setVisible(false);
    }

    @Override
    public void unfocus() {
        if (textFieldSymbols.size() == 1) {
            setVisible(false);
        }
    }

    public void type(char keyChar, int keyCode) {
        if (keyCode == 8 && textFieldSymbols.size() > 1) textFieldSymbols.remove(textFieldSymbols.size() - 2);
        else if (symbols.contains(String.valueOf(keyChar))) {
            textFieldSymbols.add(textFieldSymbols.size() - 1, keyChar);
        }
        repaint();
        System.out.println(textFieldSymbols);
    }

    public List<Character> getTextFieldSymbols() {
        return textFieldSymbols;
    }

    @Override
    protected void paintComponent(Graphics g) {
        int fieldWidth = 0;
        if (this instanceof TextFieldPanel || this instanceof PasswordPanel ) {
            g.drawImage(ImagesManager.getFormFieldImg(), 0, 0, this);
            fieldWidth = 312;
        }
        else if (this instanceof SearchTextFieldPanel) {
            g.drawImage(ImagesManager.getSearchFieldPanelImg(), 0, 0, this);
            fieldWidth = 458;
        }
        Writer.writeString(textFieldSymbols, this, fieldWidth, g);
    }
}
