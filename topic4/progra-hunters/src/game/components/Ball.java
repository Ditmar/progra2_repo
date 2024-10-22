package game.components;

import java.awt.Color;
import java.awt.Graphics;

import game.components.base.BaseDrawer;
import game.components.utils.GameConstans;
import game.components.utils.PhysicsConstans;

public class Ball implements BaseDrawer {
    private Double x, y;
    private Double speedX, speedY;
    private Double acelerationX, acelerationY;
    private Integer WIDTH = GameConstans.WIDTH.getValue();
    private Integer HEIGHT = GameConstans.HEIGHT.getValue();
    private Double friction = PhysicsConstans.FRICTION.getValue();
    private Integer radius;
    private Color color;

    public Ball(Double x, Double y, Integer radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speedX = 10.0;
        this.speedY = 0.0;
        this.acelerationX = 0.0;
        this.acelerationY = PhysicsConstans.GRAVITY.getValue();

    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(Double speedX) {
        this.speedX = speedX;
    }

    public Double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(Double speedY) {
        this.speedY = speedY;
    }

    @Override
    public void update() {
        speedX += acelerationX - friction * speedX;
        speedY += acelerationY - friction * speedY;
        x += speedX;
        y += speedY;
        if (y + radius * 2 >= HEIGHT) {
            y = (double) (HEIGHT - radius * 2);
            speedY = -speedY;
        }
        if (x + radius * 2 >= WIDTH) {
            x = (double) (WIDTH - radius * 2);
            speedX = -speedX;
        }
        if (y <= 0) {
            y = 0.0;
            speedY = -speedY;
        }
        if (x <= 0) {
            x = 0.0;
            speedX = -speedX;
        }
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x.intValue(), y.intValue(), radius * 2, radius * 2);
    }

}
