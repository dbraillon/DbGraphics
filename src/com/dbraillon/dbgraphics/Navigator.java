package com.dbraillon.dbgraphics;

import java.util.Vector;

public class Navigator {

	private Vector<Screen> screens;
	private boolean isNewScreen;
	
	public Navigator(Screen firstScreen) {
		
		screens = new Vector<Screen>();
		screens.add(firstScreen);
		
		isNewScreen = false;
	}
	
	public void pushScreen(Screen newScreen)
	{
		if(screens.contains(newScreen)) {
			
			screens.remove(newScreen);
		}
		
		screens.add(newScreen);
		isNewScreen = true;
	}
	
	public void popScreen(Screen screen)
	{
		screens.remove(screen);
		isNewScreen = true;
	}
	
	public Screen getCurrentScreen()
	{
		if(screens.size() > 0)
		{
			return screens.lastElement();
		}
	
		return null;
	}

	
	public Vector<Screen> getScreens() {
		return screens;
	}

	public void setScreens(Vector<Screen> screens) {
		this.screens = screens;
	}

	public boolean isNewScreen() {
		return isNewScreen;
	}

	public void setNewScreen(boolean isNewScreen) {
		this.isNewScreen = isNewScreen;
	}
}
