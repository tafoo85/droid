package com.indie.mobile.droidrpg.ui;

import com.indie.mobile.droidrpg.R;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.app.Activity;

public class GameActivity extends Activity implements OnTouchListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		this.findViewById(R.id.game_board_id).setOnTouchListener(this);
	}
	
	/* (non-Javadoc)
	 * @see android.view.View.OnTouchListener#onTouch(android.view.View, android.view.MotionEvent)
	 */
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		Log.i(GameActivity.class.getCanonicalName(), "(" + arg1.getX() + ", " + arg1.getY() + ")");
		return true;
	}
}
