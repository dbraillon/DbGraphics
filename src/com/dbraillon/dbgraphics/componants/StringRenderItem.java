package com.dbraillon.dbgraphics.componants;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.TrueTypeFont;

import com.dbraillon.dbgraphics.Depth;
import com.dbraillon.dbgraphics.Point;
import com.dbraillon.dbgraphics.Renderable;

public class StringRenderItem extends Renderable {

	private String value;
	private TrueTypeFont ttf;
	
	public StringRenderItem(Point position, String value) {
		super(position, Depth.Middle, new Color(255, 255, 255), 0f, 0f);
		
		this.value = value;
	}
	
	public StringRenderItem(Point position, String value, TrueTypeFont font) {
		super(position, Depth.Middle, new Color(255, 255, 255), 0f, 0f);
		
		this.value = value;
		this.ttf = font;
	}
	
	public StringRenderItem(Point position, String value, Depth depth, Color color) {
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
		
		if(ttf != null)
			gameContainer.getGraphics().setFont(ttf);
		
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
