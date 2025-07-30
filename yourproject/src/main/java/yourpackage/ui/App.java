// src/ui/ComponentsDemo.java
package yourpackage.ui;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

	public App() {
		super("Swing Components");
        this.setLayout(new FlowLayout());

        this.add(new JLabel("Label:"));
        this.add(new JTextField("Text Field", 15));
        this.add(new JButton("Click Me"));
        this.add(new JCheckBox("Check Me"));

        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
