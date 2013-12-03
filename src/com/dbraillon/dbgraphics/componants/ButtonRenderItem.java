package com.dbraillon.dbgraphics.componants;

import java.util.concurrent.Callable;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;

import com.dbraillon.dbgraphics.Depth;
import com.dbraillon.dbgraphics.Point;
import com.dbraillon.dbgraphics.Renderable;

public class ButtonRenderItem extends Renderable {

	private String label;
	private Callable<Void> onClick;
	
	public ButtonRenderItem(Point position, Depth depth, Color color, String label, Callable<Void> onClick) {
		super(position, depth, color, 0f, 0f);
		
		this.label = label;
		this.onClick = onClick;
	}
	
	@Override
	public void init(GameContainer gameContainer) {
		
		setHeight(gameContainer.getGraphics().getFont().getHeight(label));
		setWidth(gameContainer.getGraphics().getFont().getWidth(label));
		
		gameContainer.getInput().addMouseListener(new MouseListener() {
			
			@Override
			public void setInput(Input arg0) { 
				
			}
			
			@Override
			public boolean isAcceptingInput() {
				
				return true;
			}
			
			@Override
			public void inputStarted() {


			}
			
			@Override
			public void inputEnded() {


			}
			
			@Override
			public void mouseWheelMoved(int arg0) {


			}
			
			@Override
			public void mouseReleased(int arg0, int arg1, int arg2) {


			}
			
			@Override
			public void mousePressed(int arg0, int arg1, int arg2) {


			}
			
			@Override
			public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {


			}
			
			@Override
			public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {


			}
			
			@Override
			public void mouseClicked(int arg0, int x, int y, int arg3) {

				if(x > getPosition().getX() && x < getPosition().getX() + getWidth()
				&& y > getPosition().getY() && y < getPosition().getY() + getHeight()) {
					
					try {
						onClick.call();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

	@Override
	public void render(GameContainer gameContainer) {
		
		int xMouse = gameContainer.getInput().getMouseX();
		int yMouse = gameContainer.getInput().getMouseY();
		
		if(xMouse > getPosition().getX() && xMouse < getPosition().getX() + getWidth()
		&& yMouse > getPosition().getY() && yMouse < getPosition().getY() + getHeight()) {
			
			gameContainer.getGraphics().setColor(getColor().darker());
		}
		else {
			
			gameContainer.getGraphics().setColor(getColor());
		}
		
		gameContainer.getGraphics().drawString(label, getPosition().getX(), getPosition().getY());
	}
	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
