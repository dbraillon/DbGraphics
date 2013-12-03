package com.dbraillon.dbgraphics;

public class Point {

	private float x, y;
	
	public Point(float x, float y) {
		
		setX(x);
		setY(y);
	}
	
	// Getters and setters
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
}
