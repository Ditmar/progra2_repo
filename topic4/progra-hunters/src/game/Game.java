package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import game.components.Ball;
import game.components.Table;
import game.components.base.BaseDrawer;
import game.components.utils.GameConstans;

public class Game implements BaseDrawer {
    ArrayList<Ball> balls = new ArrayList<Ball>();
    Table table;
    public Game() {
        ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.ORANGE);
        colors.add(Color.PINK);
        table = new Table();
        Integer positionX = 400;
        Integer positionY = 150;
        for (Integer i = 0; i < 20; i++) {
            Ball ball = new Ball(0.0, 0.0, 10);
            ball.setBounds(table.getBoundX(), table.getBoundY(), table.getBoundWidth(), table.getBoundHeight());
            // ball.setX(Math.random() * table.getBoundWidth() + table.getBoundX());
            // ball.setY(Math.random() * table.getBoundHeight() + table.getBoundY());
            if (i % 5 != 0) {
                positionX += ball.getDiameter() + 2;
            } else {
                positionX = 400;
                positionY += ball.getDiameter() + 2;
            }
            ball.setX(positionX.doubleValue());
            ball.setY(positionY.doubleValue());
            ball.setSpeedX(0.0);
            ball.setSpeedY(0.0);
            ball.setRadius(12);
            ball.setColor(colors.get(i % colors.size()));
            balls.add(ball);
        }
        Ball newBall = new Ball(40.0, 200.0, 12);
        newBall.setSpeedX(9.0);
        newBall.setBounds(table.getBoundX(), table.getBoundY(), table.getBoundWidth(), table.getBoundHeight());
        balls.add(newBall);
    }

    @Override
    public void update() {
        for (Ball ball : balls) {
            ball.update();
            for (Ball otherBall : balls) {
                Double distance = Math.sqrt(Math.pow(ball.getX() - otherBall.getX(), 2)
                        + Math.pow(ball.getY() - otherBall.getY(), 2));

                if (distance <= ball.getRadius() + otherBall.getRadius() && ball != otherBall) {
                    solveColision(ball, otherBall);
                }

            }
        }
    }

    @Override
    public void draw(Graphics graphics) {
        table.draw(graphics);
        for (Ball ball : balls) {
            ball.draw(graphics);
        }
    }

    private void solveColision(Ball ball, Ball otherBall) {
        Double xDistance = otherBall.getX() - ball.getX();
        Double yDistance = otherBall.getY() - ball.getY();
        Double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        Double normalX = xDistance / distance;
        Double normalY = yDistance / distance;
        Double tangentX = -normalY;
        Double tangentY = normalX;

        Double speedNormal1 = normalX * ball.getSpeedX() + normalY * ball.getSpeedY();
        Double speedTangent1 = tangentX * ball.getSpeedX() + tangentY * ball.getSpeedY();

        Double speedNormal2 = normalX * otherBall.getSpeedY() + normalY * otherBall.getSpeedY();
        Double speedTangent2 = tangentX * otherBall.getSpeedY() + tangentY * otherBall.getSpeedY();

        Double newFinalSpeed1 = speedNormal2;
        Double newFinalSpeed2 = speedNormal1;
        // transformamos a vectores
        Double vn1x = newFinalSpeed1 * normalX;
        Double vn1y = newFinalSpeed1 * normalY;
        Double vt1x = speedTangent1 * tangentX;
        Double vt1y = speedTangent1 * tangentY;

        Double vn2x = newFinalSpeed2 * normalX;
        Double vn2y = newFinalSpeed2 * normalY;
        Double vt2x = speedTangent2 * tangentX;
        Double vt2y = speedTangent2 * tangentY;

        ball.setSpeedX((vn1x + vt1x));
        ball.setSpeedY((vn1y + vt1y));
        otherBall.setSpeedX((vn2x + vt2x));
        otherBall.setSpeedY((vn2y + vt2y));
        Double overlap = 0.5 * (ball.getRadius() + otherBall.getRadius() - distance + 1);
        ball.setX(ball.getX() - overlap * normalX);
        ball.setY(ball.getY() - overlap * normalY);
    }



}
