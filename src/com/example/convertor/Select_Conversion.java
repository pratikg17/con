package com.example.convertor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Select_Conversion extends Activity {

	ListView lvSU ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if(getIntent().getBooleanExtra("exit",false))
		{
			finish();
		}
		else
		{
		
		setContentView(R.layout.activity_select__conversion);
		lvSU = (ListView) findViewById(R.id.listviewSC);
		
		String [] conversion = getResources().getStringArray(R.array.conversion);
		ArrayAdapter<String> adapterSC = new ArrayAdapter<String> (getBaseContext(),android.R.layout.simple_list_item_1,conversion);
		lvSU.setChoiceMode(1);
		lvSU.setAdapter(adapterSC);
		lvSU.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					Intent icon = new Intent(Select_Conversion.this,Conrrency.class);
					startActivity(icon);
					break;
				case 1:
					Intent itemp = new Intent(Select_Conversion.this,Temperture.class);
					startActivity(itemp);
					break;
				case 2:
					Intent iSpeed = new Intent(Select_Conversion.this,Speed.class);
					startActivity(iSpeed);
					break;
				case 3:
					Intent iTime = new Intent(Select_Conversion.this,Time.class);
					startActivity(iTime);
					break;
				case 4:
					Intent iArea = new Intent(Select_Conversion.this,Area.class);
					startActivity(iArea);
					break;
				case 5:
					Intent iVol = new Intent(Select_Conversion.this,Volume.class);
					startActivity(iVol);
					break;
				case 6:
					Intent iLen = new Intent(Select_Conversion.this,Length.class);
					startActivity(iLen);
					break;
				default:
					break;
				}
			}
		});
		}
	}

	
}
