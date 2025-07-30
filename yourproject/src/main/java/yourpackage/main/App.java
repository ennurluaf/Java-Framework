package yourpackage.main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
public class App extends JFrame {

    public App() {
        init();
        System.out.println( "Hello World!" );
    }
    
    private void init() {
        setTitle("Hello World Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main( String[] args ) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
