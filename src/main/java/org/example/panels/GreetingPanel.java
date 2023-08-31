package org.example.panels;

import org.example.AppState;
import org.example.buttons.ButtonType;
import org.example.buttons.SimpleButton;
import org.example.service.BeanManager;
import org.example.service.Dimensions;

public class GreetingPanel extends SamplePanel {

    public GreetingPanel() {
        SimpleButton startAppButton = new SimpleButton(null);
        Dimensions dimensions = new Dimensions(300, 330, 100, 40);
        addButton(startAppButton, ButtonType.START_APP, this, dimensions);
    }

    @Override
    public void actionButton(ButtonType buttonType) {
        BeanManager.getAppFrame().updFrame(AppState.START_PANEL);
        ((Fillable)BeanManager.getMainPanelBean(AppState.START_PANEL)).prepareToUse();
        setVisible(false);
    }
}
