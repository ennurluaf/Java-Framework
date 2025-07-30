// src/game/GameLoop.java
package yourpackage.game;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable {
    private Thread thread;
	private Input input;
    private boolean running = false;
    private int fps = 0;

    public Game() {
		this.input = new Input(this);
        this.setPreferredSize(new Dimension(800, 600));
		this.addMouseListener(input);
		this.addMouseMotionListener(input);
		this.addKeyListener(input);
        this.start();
    }

    public void start() {
        thread = new Thread(this);
        running = true;
        thread.start();
    }

	@Override
    public void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1_000_000_000.0 / 60;
        double delta = 0;
        int frames = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            if (delta >= 1) {
                repaint();
                delta--;
                frames++;
            }

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                fps = frames;
                frames = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("FPS: " + fps, 10, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Loop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Game());
        frame.pack();
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
