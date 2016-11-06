package com.example.convertor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);

	Thread t = new Thread(){
	public void run()
	{
		try
		{
			sleep(3*1000);
			Intent i = new Intent(getBaseContext(),Select_Conversion.class);
			startActivity(i);
			finish();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	};
t.start();
	}

}
