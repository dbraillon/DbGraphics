package com.dbraillon.dbgraphics;

import java.util.Vector;

public class Navigator {

	private static Vector<Screen> screens;
	
	public Navigator(Screen firstScreen) {
		
		setScreens(new Vector<Screen>());
		getScreens().add(firstScreen);
	}
	
	public void pushScreen(Screen newScreen)
	{
		if(getScreens().contains(newScreen)) {
			
			getScreens().remove(newScreen);
		}
		
		getScreens().add(newScreen);
	}
	
	public void popScreen(Screen screen)
	{
		getScreens().remove(screen);
	}
	
	public Screen getCurrentScreen()
	{
		if(getScreens().size() > 0)
		{
			return getScreens().lastElement();
		}
	
		return null;
	}

	
	public static Vector<Screen> getScreens() {
		return screens;
	}

	public static void setScreens(Vector<Screen> screens) {
		Navigator.screens = screens;
	}
}
