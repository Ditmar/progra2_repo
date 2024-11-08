package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import game.components.Ball;
import game.components.Table;
import game.components.base.BaseDrawer;
import game.components.utils.GameConstans;
import game.components.utils.InitGame;

public class Game implements BaseDrawer {
    ArrayList<Ball> balls = new ArrayList<Ball>();
    Table table;
    Double mouseX, mouseY;
    Ball whiteBall;
    Double difX, difY;
    Double distance;
    Mouse mouse;
    MainWindow window;
    Boolean fireClick = false;
    public Game(Canvas canvas) {
        mouse = new Mouse(canvas);
        System.out.println("click event");
        this.window = window;
        canvas.addMouseListener(null);
        canvas.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent me) {
        		fireClick = true;
            }
        });
        ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.ORANGE);
        colors.add(Color.PINK);
        table = new Table();
        for (Integer i = 0; i < 15; i++) {
            Ball ball = new Ball(0.0, 0.0, 10);
            ball.setBounds(table.getBoundX(), table.getBoundY(), table.getBoundWidth(), table.getBoundHeight());
            // ball.setX(Math.random() * table.getBoundWidth() + table.getBoundX());
            // ball.setY(Math.random() * table.getBoundHeight() + table.getBoundY());
            ball.setSpeedX(0.0);
            ball.setSpeedY(0.0);
            ball.setRadius(12);
            ball.setColor(colors.get(i % colors.size()));
            balls.add(ball);
        }
        whiteBall = new Ball(
            GameConstans.WHITE_BALL_INIT_POSITION_X.getValue().doubleValue(), 
            GameConstans.WHITE_BALL_INIT_POSITION_Y.getValue().doubleValue(), 
            12);
        whiteBall.setSpeedX(7.0);
        whiteBall.setColor(Color.WHITE);
        whiteBall.setBounds(table.getBoundX(), table.getBoundY(), table.getBoundWidth(), table.getBoundHeight());
        balls.add(whiteBall);
        InitGame.orderPosition(balls, 
        GameConstans.BALLS_INIT_POSITION_X.getValue(), 
        GameConstans.BALLS_INIT_POSITION_Y.getValue());
    }



    @Override
    public void update() {
    	mouse.update();
        updateForceDirection();
        fireWhiteBallUpdate();
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

    private void updateForceDirection() {
        difX = - mouse.getMouseX() + whiteBall.getX() + whiteBall.getRadius();
        difY = - mouse.getMouseY() + whiteBall.getY() + whiteBall.getRadius();
        distance = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }
    private void fireWhiteBallUpdate() {
    	if (this.fireClick) {
    		Double force = distance / 10;
    		if (force < 1.0) {
    			force = 1.0;
    		}
    		System.out.println("force " + force);
    		
    		whiteBall.setSpeedX((difX / 100) * force);
    		whiteBall.setSpeedY((difY / 100) * force);
    		this.fireClick = false;
    	} 
    }

    @Override
    public void draw(Graphics graphics) {
        table.draw(graphics);
        graphics.setColor(Color.RED);
        graphics.drawLine(whiteBall.getX().intValue() + whiteBall.getRadius(), whiteBall.getY().intValue() + whiteBall.getRadius().intValue(), 
        		mouse.getMouseX().intValue(), mouse.getMouseY().intValue());
        graphics.drawString("Mouse X = " + mouseX + " Mouse y = " + mouseY, 10, 10);
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
