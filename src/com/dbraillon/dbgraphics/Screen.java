package com.dbraillon.dbgraphics;

import java.util.EnumMap;
import java.util.Map;
import java.util.Vector;

import org.newdawn.slick.GameContainer;


public abstract class Screen {

	private Map<Depth, Vector<Renderable>> mappedDataZRenderables;
	private Navigator navigator;
	
	public Screen() {
		
		mappedDataZRenderables = new EnumMap<Depth, Vector<Renderable>>(Depth.class);
		
		for(Depth dataZ : Depth.values()) {
			
			mappedDataZRenderables.put(dataZ, new Vector<Renderable>());
		}
	}
	
	public void init(Navigator navigator, GameContainer gameContainer) {
		
		this.navigator = navigator;
		
		for(Vector<Renderable> renderables : mappedDataZRenderables.values()) {
			
			for(Renderable renderable : renderables) {
				
				renderable.init(gameContainer);
			}
		}
	}
	
	public void render(GameContainer gameContainer) {
	
		for(Vector<Renderable> renderables : mappedDataZRenderables.values()) {
			
			for(Renderable renderable : renderables) {
				
				renderable.render(gameContainer);
			}
		}
	}
	
	public void update(GameContainer gameContainer, double frameTimeModifier) {
		
		for(Vector<Renderable> renderables : mappedDataZRenderables.values()) {
			
			for(Renderable renderable : renderables) {
				
				renderable.update(gameContainer, frameTimeModifier);
			}
		}
	}
	
	
	public void addItem(Renderable item) {
		
		mappedDataZRenderables.get(item.getDepth()).add(item);
	}
	
	public void removeItem(Renderable item) {
		
		mappedDataZRenderables.get(item.getDepth()).remove(item);
	}

	public Navigator getNavigator() {
		return navigator;
	}

	public void setNavigator(Navigator navigator) {
		this.navigator = navigator;
	}
}
