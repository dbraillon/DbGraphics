package com.dbraillon.dbgraphics;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;

public abstract class Renderable  {
	
	private Point position;
	private Depth depth;
	private Color color;
	private float height, width;
	
	protected Renderable(Point position, Depth depth) {
		
		this.setPosition(position);
		this.setDepth(depth);
		this.setColor(color);
		this.setHeight(height);
		this.setWidth(width);
	}
	
	protected Renderable(Point position, Depth depth, Color color, float height, float width) {
		
		this.setPosition(position);
		this.setDepth(depth);
		this.setColor(color);
		this.setHeight(height);
		this.setWidth(width);
	}
	
	protected void init(GameContainer gameContainer) {}
	protected void render(GameContainer gameContainer) {}
	protected void update(GameContainer gameContainer, double frameTimeModifier) {}


	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}


	public Depth getDepth() {
		return depth;
	}


	public void setDepth(Depth depth) {
		this.depth = depth;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}
}
