package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

import game.components.base.BaseDrawer;

public class Mouse implements BaseDrawer {

	private Double mouseX, mouseY;
	private Canvas canvas;
	public Mouse (Canvas canvas) {
		this.canvas = canvas;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
        PointerInfo pointer = MouseInfo.getPointerInfo();
        Point point = pointer.getLocation();
        setMouseX(point.getX()  - (int)this.canvas.getLocationOnScreen().getX());
        setMouseY(point.getY() - (int)this.canvas.getLocationOnScreen().getY());
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	public Double getMouseX() {
		return mouseX;
	}

	public void setMouseX(Double mouseX) {
		this.mouseX = mouseX;
	}

	public Double getMouseY() {
		return mouseY;
	}

	public void setMouseY(Double mouseY) {
		this.mouseY = mouseY;
	}

}
