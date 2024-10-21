package game;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class MainWindow extends JFrame implements Runnable {
    private final Integer WIDTH = 800, HEIGHT = 600;
    private Thread thread;
    private Boolean isRunning;
    private Canvas canvas;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;
    private Integer FPS = 30;
    private double targetTime = 1000000000 / FPS;
    private double delta;
    private Integer AVERAGE_FRAMES = 0;

    private Integer x = 0, y = 0;
    public MainWindow() {
        setTitle("Programers Hunters");
        setSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);
        this.add(canvas);
        this.pack();
    }
    public void start() {
        canvas.createBufferStrategy(3);
        bufferStrategy = canvas.getBufferStrategy();
        thread = new Thread(this);
        thread.start();
        isRunning = true;
    }
    public void stop() {
        try {
            thread.join();
            isRunning = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    private void draw() {
        bufferStrategy = canvas.getBufferStrategy();
        if (bufferStrategy == null) {
            canvas.createBufferStrategy(3);
            return;
        }
        graphics = bufferStrategy.getDrawGraphics();
        //----------- aqui se programa tu juego-------------------
        graphics.clearRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawString("FPS: " + AVERAGE_FRAMES,10, 10);
        graphics.drawOval(x, y, 30, 30);
        //--------------------------------
        graphics.dispose();
        bufferStrategy.show();
    }
    private void update() {
        x++;
    }
    @Override
    public void run() {
        long now = 0;
        long lastTime = System.nanoTime();
        delta = 0;
        Integer frames = 0;
        long time = 0;
        while(isRunning) {
            now = System.nanoTime();
            delta += (now - lastTime) / targetTime;
            time += (now - lastTime);
            lastTime = now;
            if (delta >= 1) {
                update();
                draw();
                delta--;
                frames++;
            }
            if (time >= 1000000000) {
                AVERAGE_FRAMES = frames;
                frames = 0;
                time = 0;
            }


  
        }
        stop();
    }
}
