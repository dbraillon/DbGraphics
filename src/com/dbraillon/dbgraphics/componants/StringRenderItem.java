package com.dbraillon.dbgraphics.componants;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;

import com.dbraillon.dbgraphics.Depth;
import com.dbraillon.dbgraphics.Point;
import com.dbraillon.dbgraphics.Renderable;

public class StringRenderItem extends Renderable {

	private String value;
	
	public StringRenderItem(Point position, Depth depth, Color color, String value) {
		super(position, depth, color, 0f, 0f);
		
		this.value = value;
	}
	
	@Override
	protected void init(GameContainer gameContainer) {
		
		setHeight(gameContainer.getGraphics().getFont().getHeight(value));
		setWidth(gameContainer.getGraphics().getFont().getWidth(value));
	}
	
	@Override
	protected void render(GameContainer gameContainer) {
		
		gameContainer.getGraphics().setColor(getColor());
		gameContainer.getGraphics().drawString(value, getPosition().getX(), getPosition().getY());
	}

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		
		this.value = value;
	}
}
