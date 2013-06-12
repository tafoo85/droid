package com.indie.mobile.droidrpg.ui;

import com.indie.mobile.droidrpg.R;
import com.indie.mobile.droidrpg.game.Game;

import android.os.Bundle;
import android.app.Activity;

public class GameActivity extends Activity {	
	private Game _game;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this._game = Game.getGameInstance();
		this._game.loadConfiguration();
		setContentView(R.layout.activity_game);
		this.findViewById(R.id.gameboard).setOnTouchListener(this._game);
	}
}
