package yourpackage.main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {

    private final App app;

    public Panel(App app) {
        this.app = app;
    }

    @Override
    protected void paintComponent(Graphics arg0) {
        super.paintComponent(arg0);
    }

}
