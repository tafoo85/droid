/**
 * 
 */
package com.indie.mobile.droidrpg.game;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/**
 * @author Anthony Dwyer
 *
 */
public class Game implements IConfigurable, OnTouchListener {

	private static final Game gameInstance;
	
	static {
		gameInstance = new Game();
	}
	
	private Game() { }
	
	/* (non-Javadoc)
	 * @see com.indie.mobile.droidrpg.game.IConfigurable#loadConfiguration()
	 */
	@Override
	public void loadConfiguration() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static Game getGameInstance() {
		return Game.gameInstance;
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnTouchListener#onTouch(android.view.View, android.view.MotionEvent)
	 */
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		Log.i(Game.class.getCanonicalName(), String.format("Touch Event at (%12.5f, %22.5f)", event.getX(), event.getY()));
		return true;
	}
}
