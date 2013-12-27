package com.dbraillon.dbgraphics;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class UiApplication extends BasicGame {

	private AppGameContainer appGameContainer;
	private Navigator navigator;
	private int frameRate;
	
	public UiApplication(int height, int width, String title, Screen firstScreen, int frameRate) throws SlickException {
		super(title);
		
		this.navigator = new Navigator(firstScreen);
		this.frameRate = frameRate;
		
		this.appGameContainer = new AppGameContainer(this);
		this.appGameContainer.setDisplayMode(width, height, false);
		this.appGameContainer.setTargetFrameRate(frameRate);
		this.appGameContainer.start();
	}

	@Override
	public void init(GameContainer gameContainer) throws SlickException {
		
		navigator.getCurrentScreen().init(navigator, gameContainer);
	}
	
	@Override
	public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
		
		if(navigator.getCurrentScreen() == null) {
			
			System.exit(0);
		}
		else
		{
			navigator.getCurrentScreen().render(gameContainer);
		}
	}

	@Override
	public void update(GameContainer gameContainer, int lastFrameTime) throws SlickException {
		
		if(navigator.getCurrentScreen() == null) {
			
			System.exit(0);
		}
		else
		{
			navigator.getCurrentScreen().update(gameContainer, lastFrameTime / frameRate);
		}
		
	}

	
	public Navigator getNavigator() {
		return navigator;
	}

	public void setNavigator(Navigator navigator) {
		this.navigator = navigator;
	}
}
