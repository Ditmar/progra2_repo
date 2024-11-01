package game.components;

import java.awt.Color;
import java.awt.Graphics;

import game.components.base.BaseDrawer;
import loaders.Assets;

public class Table implements BaseDrawer  {
    private Integer x, y;
    private Integer width, height;

    private Integer boundX, boundY;
    private Integer boundWidth, boundHeight;

    public Table() {
        this.boundX = 55;
        this.boundY = 60;
        this.boundWidth = 593;
        this.boundHeight = 355;
    }
    
    
    public Integer getBoundX() {
        return boundX;
    }


    public void setBoundX(Integer boundX) {
        this.boundX = boundX;
    }


    public Integer getBoundY() {
        return boundY;
    }


    public void setBoundY(Integer boundY) {
        this.boundY = boundY;
    }


    public Integer getBoundWidth() {
        return boundWidth;
    }


    public void setBoundWidth(Integer boundWidth) {
        this.boundWidth = boundWidth;
    }


    public Integer getBoundHeight() {
        return boundHeight;
    }


    public void setBoundHeight(Integer boundHeight) {
        this.boundHeight = boundHeight;
    }


    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(Assets.table, 0, 0, null);
    }
    
}
