package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import game.components.Ball;
import game.components.base.BaseDrawer;

public class Game implements BaseDrawer {
    ArrayList<Ball> balls = new ArrayList<Ball>();

    public Game() {
        ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.ORANGE);
        colors.add(Color.PINK);
        for (Integer i = 0; i < 100; i++) {
            Ball ball = new Ball(0.0, 0.0, 10);
            ball.setSpeedX(Math.random() * 50);
            ball.setSpeedY(Math.random() * 50);
            ball.setRadius(i % 10 + 10);
            ball.setColor(colors.get(i % colors.size()));
            balls.add(ball);
        }
    }

    @Override
    public void update() {
        for (Ball ball : balls) {
            ball.update();

        }
    }

    @Override
    public void draw(Graphics graphics) {
        for (Ball ball : balls) {
            ball.draw(graphics);

        }
    }

}
