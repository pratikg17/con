package com.example.convertor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Time extends Activity {
	int FROM_TIME,TO_TIME;
	double CONRESULT_TIME;
	
	
	Spinner spfromStime,sptoStime;
	EditText etvalueTime;
	ImageButton ibconvertResultTime;
	FragmentResultTime fgtime;
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time);
		fgtime = (FragmentResultTime) getFragmentManager().findFragmentById(R.id.fragResultTime);
		spfromStime = (Spinner) findViewById(R.id.spinner_fromTime);
		sptoStime= (Spinner) findViewById(R.id.spinner_toTime);
		
		String[] contime = getResources().getStringArray(R.array.timearray);
		ArrayAdapter<String> fromTimeAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,contime);
		spfromStime.setAdapter(fromTimeAdapter);
		ArrayAdapter<String> toTimeAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,contime);
		sptoStime.setAdapter(toTimeAdapter);
		
		etvalueTime =(EditText) findViewById( R.id.etConvertTime);
		ibconvertResultTime = (ImageButton) findViewById(R.id.convertImgButtonTime);
		ibconvertResultTime.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(etvalueTime.getText().length()!=0)
					
				{
				
				String valtime= etvalueTime.getText().toString();
				int valinttime = Integer.parseInt(valtime);
				
				
				if(FROM_TIME==0)
				{
					switch (TO_TIME) {
					case 0:
						CONRESULT_TIME = valinttime;
						String MstoMs = Double.toString(CONRESULT_TIME);
						setMsgTime(MstoMs);
						
						break;
					case 1:
						CONRESULT_TIME = (valinttime*0.001);
						String MstoS = Double.toString(CONRESULT_TIME);
						setMsgTime(MstoS);
						
						break;
					case 2:
						CONRESULT_TIME = (valinttime*1.6667e-5);
						String MstoM = Double.toString(CONRESULT_TIME);
						setMsgTime(MstoM);
						
						break;
					case 3:
						CONRESULT_TIME = (valinttime*2.77783333e-7);
						String MstoH = Double.toString(CONRESULT_TIME);
						setMsgTime(MstoH);
						
						break;
									
						

					default:
						break;
					}
					
				}
				else if (FROM_TIME==1)
				{
					switch (TO_TIME) {
					case 0:
						CONRESULT_TIME = (valinttime*1000);
						String StoMs = Double.toString(CONRESULT_TIME);
						setMsgTime(StoMs);
						
						break;
					case 1:
						CONRESULT_TIME = (valinttime);
						String StoS = Double.toString(CONRESULT_TIME);
						setMsgTime(StoS);
						
						break;
					case 2:
						CONRESULT_TIME = (valinttime*0.0166667);
						String StoM = Double.toString(CONRESULT_TIME);
						setMsgTime(StoM);
						
						break;
					case 3:
						CONRESULT_TIME = (valinttime*0.000277778);
						String StoH = Double.toString(CONRESULT_TIME);
						setMsgTime(StoH);
						
						break;

					default:
						break;
					}
				}
				else if(FROM_TIME==2)
				{
					switch (TO_TIME) {
					case 0:
						CONRESULT_TIME = (valinttime*60000);
						String MtoMs = Double.toString(CONRESULT_TIME);
						setMsgTime(MtoMs);
						break;
					case 1:
						CONRESULT_TIME = (valinttime*60);
						String MtoS = Double.toString(CONRESULT_TIME);
						setMsgTime(MtoS);
						break;
					case 2:
						CONRESULT_TIME = (valinttime);
						String MtoMt = Double.toString(CONRESULT_TIME);
						setMsgTime(MtoMt);
						break;
					case 3:
						CONRESULT_TIME = (valinttime*0.0166667);
						String MtoH = Double.toString(CONRESULT_TIME);
						setMsgTime(MtoH);
						break;
							

					default:
						break;
					}
				}
				else if(FROM_TIME==3)
				{
					switch (TO_TIME) {
					case 0:
						CONRESULT_TIME = (valinttime*3.6e+6);
						String HtoMs = Double.toString(CONRESULT_TIME);
						setMsgTime(HtoMs);
						break;
						
					case 1:
						CONRESULT_TIME = (valinttime*3600);
						String HtoS = Double.toString(CONRESULT_TIME);
						setMsgTime(HtoS);
						break;
					case 2:
						CONRESULT_TIME = (valinttime*60);
						String HtoMt = Double.toString(CONRESULT_TIME);
						setMsgTime(HtoMt);
						break;		
					case 3:
						CONRESULT_TIME = (valinttime);
						String HtoH = Double.toString(CONRESULT_TIME);
						setMsgTime(HtoH);
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
	
		
		
		
		spfromStime.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				FROM_TIME = position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> position) {
				// TODO Auto-generated method stub
				
			}
		});
		sptoStime.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				TO_TIME = position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> position) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
public void setMsgTime(String s1) {
		
		fgtime.setInFragmentTime(s1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.time, menu);
		return true;
	}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.time_more:
		Intent itime = new Intent(Time.this,Select_Conversion.class);
		startActivity(itime);
		
		break;
	case R.id.time_refresh:
		etvalueTime.setText("");
		break;
	case R.id.time_exit:
		Intent i6=new Intent(getBaseContext(),Select_Conversion.class);
		i6.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		i6.putExtra("exit", true);
		startActivity(i6);
		return true;

		
	default:
		
		break;
	}
	
	return super.onOptionsItemSelected(item);
}
}
