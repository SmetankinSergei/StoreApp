package org.example.panels.start;

import org.example.buttons.ButtonType;
import org.example.panels.SamplePanel;
import org.example.service.ImagesManager;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
@Scope("prototype")
public class BlockPanel extends SamplePanel {

    private BlockPanelState state = BlockPanelState.BLOCK_ALL;

    public BlockPanel() {
        if (state == BlockPanelState.UNBLOCK) {
            setVisible(false);
        } else if (state == BlockPanelState.BLOCK_ALL) {
            setSize(500, 40);
            setVisible(true);
        } else if (state == BlockPanelState.BLOCK_FOR_GUEST) {
            setSize(300, 40);
            setVisible(true);
        }
    }

    public void setState(BlockPanelState state) {
        this.state = state;
    }

    @Override
    public void actionButton(ButtonType buttonType) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        if (state == BlockPanelState.BLOCK_ALL) g.drawImage(ImagesManager.getBlockPanelImg(), 0, 0, this);
        else if (state == BlockPanelState.BLOCK_FOR_GUEST) g.drawImage(ImagesManager.getBlockForGuestPanelImg(), 0, 0, this);
    }
}
