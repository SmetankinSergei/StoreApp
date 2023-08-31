package org.example;

import org.example.panels.GreetingPanel;
import org.example.service.BeanManager;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@Component
public class AppFrame extends JFrame {

    private final Container container;

    public AppFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(718, 747);
        setTitle("Store");
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        container = this.getContentPane();
        GreetingPanel greetingPanel = new GreetingPanel();
        container.add(greetingPanel);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                System.out.println(e.getKeyChar());
                BeanManager.getButtonsController().type(e.getKeyChar(), e.getKeyCode());
            }
        });
        setFocusable(true);
    }

    public void updFrame(AppState appState) {
        System.out.println("upd " + appState);
        container.removeAll();
        container.add(BeanManager.getMainPanelBean(appState));
        container.revalidate();
        repaint();
    }
}
