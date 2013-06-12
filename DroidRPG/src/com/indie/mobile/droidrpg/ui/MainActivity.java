package com.indie.mobile.droidrpg.ui;

import com.indie.mobile.droidrpg.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.setupButtonListeners();
	}
	
	/**
	 * 
	 */
	private void setupButtonListeners() {
		Button exit = (Button) findViewById(R.id.exitButton);
		Button start = (Button)  findViewById(R.id.startButton) ;
		Button settings = (Button)  findViewById(R.id.settingsButton);
		Button multi = (Button)  findViewById(R.id.multiStartButton);
		
		exit.setOnClickListener(this);
		start.setOnClickListener(this);
		settings.setOnClickListener(this);
		multi.setOnClickListener(this);
	}

	public void onStartClick(View view) {
		Intent intent = new Intent(this, GameActivity.class);
		this.startActivity(intent);
	}
	
	public void onMultiClick(View view) {
		
	}

	public void onSettingsClick(View view) {
	
	}

	public void onExtiClick(View view) {
		this.finish();
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.exitButton : 
				this.onExtiClick(v);
				break;
				
			case R.id.startButton : 
				this.onStartClick(v);
				break;
				
			case R.id.settingsButton : 
				this.onSettingsClick(v);
				break;
				
			case R.id.multiStartButton: 
				this.onMultiClick(v);
				break;
		}
	}
}
