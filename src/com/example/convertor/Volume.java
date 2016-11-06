	package com.example.convertor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class Volume extends Activity {
	int FROM_VOLUME,TO_VOLUME;
	double CONRESULT_VOLUME;
	
	
	Spinner spfromSvolume,sptoSvolume;
	EditText etvalueVolume;
	ImageButton ibconvertResultVolume;
	FragmentResultVolume fgvolume;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_volume);
		fgvolume = (FragmentResultVolume) getFragmentManager().findFragmentById(R.id.fragResultVolume);
		
		spfromSvolume = (Spinner) findViewById(R.id.spinner_fromVolume);
		sptoSvolume= (Spinner) findViewById(R.id.spinner_toVolume);
		
		String[] convolume = getResources().getStringArray(R.array.volumearray);
		ArrayAdapter<String> fromVolumeAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,convolume);
		spfromSvolume.setAdapter(fromVolumeAdapter);
		ArrayAdapter<String> toVolumeAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,convolume);
		sptoSvolume.setAdapter(toVolumeAdapter);
		etvalueVolume =(EditText) findViewById( R.id.etConvertVolume);
		ibconvertResultVolume = (ImageButton) findViewById(R.id.convertImgButtonVolume);

	
	ibconvertResultVolume.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(etvalueVolume.getText().length()!=0)
				
			{

			
			String valvolume= etvalueVolume.getText().toString();
			int valintvolume = Integer.parseInt(valvolume);
			

			
			if(FROM_VOLUME==0)
			{
				switch (TO_VOLUME) {
				case 0:
					CONRESULT_VOLUME = valintvolume;
					String LtoL = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(LtoL);
					break;
				case 1:
					CONRESULT_VOLUME = (valintvolume*1000000);
					String LtoMl = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(LtoMl);
					break;
				case 2:
					CONRESULT_VOLUME = (valintvolume*1000000);
					String LtoCm = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(LtoCm);
					break;
				case 3:
					CONRESULT_VOLUME = (valintvolume*0.219969);
					String LtoG = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(LtoG);
					break;

				default:
					break;
				}
			}
			else if(FROM_VOLUME==1)
			{
				switch (TO_VOLUME) {
				case 0:
					CONRESULT_VOLUME = (valintvolume*0.001);
					String MltoL = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(MltoL);
					break;
				case 1:
					CONRESULT_VOLUME = (valintvolume);
					String MltoMl = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(MltoMl);
					break;
				case 2:
					CONRESULT_VOLUME = (valintvolume*1e-6);
					String MltoCm = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(MltoCm);
					break;
				case 3:
					CONRESULT_VOLUME = (valintvolume*0.000219969);
					String MltoG = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(MltoG);
					break;
						

				default:
					break;
				}
			}
			else if(FROM_VOLUME==2)
			{
				switch (TO_VOLUME) {
				case 0:
					CONRESULT_VOLUME = (valintvolume*1000);
					String CmtoL = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(CmtoL);
					break;
				case 1:
					CONRESULT_VOLUME = (valintvolume*1e+6);
					String CmtoMl = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(CmtoMl);
					break;
				case 2:
					CONRESULT_VOLUME = (valintvolume);
					String CmtoCm = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(CmtoCm);
					break;
				case 3:
					CONRESULT_VOLUME = (valintvolume*219.969);
					String CmtoG = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(CmtoG);
					break;
				

				default:
					break;
				}
			}
			else if(FROM_VOLUME==3)
			{
				switch (TO_VOLUME) {
				case 0:
					CONRESULT_VOLUME = (valintvolume*4.54609);
					String GtoL = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(GtoL);
					break;
				case 1:
					CONRESULT_VOLUME = (valintvolume*4546.09);
					String GtoML = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(GtoML);
					break;
				case 2:
					CONRESULT_VOLUME = (valintvolume*0.00454609);
					String GtoCm = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(GtoCm);
					break;
					
				case 3:
					CONRESULT_VOLUME = (valintvolume);
					String GtoG = Double.toString(CONRESULT_VOLUME);
					setMsgVolume(GtoG);
					break;
					default:
					break;
				}
			}
			}
			else
			{
				
				Toast.makeText(getBaseContext(),"Enter a Value", Toast.LENGTH_SHORT).show();
				
			}
		}
	});		
		
		
		
		
		
		
		
		
		
		
		
		spfromSvolume.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				FROM_VOLUME = position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> position) {
				// TODO Auto-generated method stub
				
			}
		});

		
		sptoSvolume.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				TO_VOLUME = position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> position) {
				// TODO Auto-generated method stub
				
			}
		});

		
		
	}
public void setMsgVolume(String s1) {
		
		fgvolume.setInFragmentVolume(s1);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.volume, menu);
		return true;
	}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.vol_more:
		Intent ivol = new Intent(Volume.this,Select_Conversion.class);
		startActivity(ivol);
		
		break;
	case R.id.vol_refresh:
		etvalueVolume.setText("");
		break;
	case R.id.vol_exit:
		Intent i7=new Intent(getBaseContext(),Select_Conversion.class);
		i7.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		i7.putExtra("exit", true);
		startActivity(i7);
		return true;

		
	default:
		
		break;
	}
	
	
	return super.onOptionsItemSelected(item);
}
}
