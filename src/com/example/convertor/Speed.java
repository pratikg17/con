package com.example.convertor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
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

public class Speed extends Activity {
	int FROM_SPEED,TO_SPEED;
	double CONRESULT_SPEED;
	
	
	Spinner spfromSspeed,sptoSspeed;
	EditText etvalueSpeed;
	ImageButton ibconvertResultSpeed;
	FragmentResultSpeed fgspeed;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_speed);
		
		fgspeed = (FragmentResultSpeed) getFragmentManager().findFragmentById(R.id.fragResultSpeed);
		
		spfromSspeed =(Spinner) findViewById(R.id.spinner_fromSpeed);
		sptoSspeed =(Spinner) findViewById(R.id.spinner_toSpeed);
		String[] speedcon =getResources().getStringArray(R.array.speedarray);
		ArrayAdapter<String> fromSpeedAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,speedcon);
		spfromSspeed.setAdapter(fromSpeedAdapter);
		ArrayAdapter<String> toSpeedAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,speedcon);
		sptoSspeed.setAdapter(toSpeedAdapter);
		
		
		
		etvalueSpeed=(EditText) findViewById(R.id.etConvertSpeed);
		ibconvertResultSpeed =(ImageButton) findViewById(R.id.convertImgButtonSpeed);
		
		ibconvertResultSpeed.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub
				

				if(etvalueSpeed.getText().length()!=0)
				
				{

				
				String valspeed = etvalueSpeed.getText().toString();
				int valintSpeed = Integer.parseInt(valspeed);
				if(FROM_SPEED==0)
				{
					switch (TO_SPEED) {
					case 0:
						CONRESULT_SPEED = valintSpeed;
						String MtoM = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MtoM);
						
						break;
					case 1:
						CONRESULT_SPEED = (double)((valintSpeed)*(0.44704));
						
						String MtoMts = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MtoMts);
						
						break;
					case 2:
						CONRESULT_SPEED =  (double)(valintSpeed*1.60934);
						String MtoKh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MtoKh);
						
						break;
					case 3:
						CONRESULT_SPEED = (double)(valintSpeed*1.46667);
						String MtoFs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MtoFs);
						
						break;	
					case 4:
						CONRESULT_SPEED =(double) (valintSpeed*0.868976);
						String MtoKnt = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MtoKnt);
						
						break;	
					default:
						break;
					}
				}
				else if(FROM_SPEED==1)
				{
					switch (TO_SPEED) {
					
					case 0:
						CONRESULT_SPEED = (valintSpeed*2.23693629);
						String MstoM = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MstoM);
						
						break;
						
					case 1:
						CONRESULT_SPEED = (valintSpeed);
						String MstoMs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MstoMs);
						
						break;
					case 2:
						CONRESULT_SPEED = (valintSpeed*3.6);
						String MstoKh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MstoKh);
						
						break;
					case 3:
						CONRESULT_SPEED = (valintSpeed*3.28084);
						String MstoFs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MstoFs);
						
						break;						
					
					case 4:
						CONRESULT_SPEED = (valintSpeed*1.94384);
						String MstoKnt = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(MstoKnt);
						
						break;

					default:
						break;
					}
				}
				else if(FROM_SPEED==2)
				{
					switch (TO_SPEED) {
					case 0:
						CONRESULT_SPEED = (valintSpeed*0.621371);
						String KhtoMh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KhtoMh);
						break;
						
					case 1:
						CONRESULT_SPEED = (valintSpeed*0.277778);
						String KhtoMs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KhtoMs);
						break;
					case 2:
						CONRESULT_SPEED = (valintSpeed);
						String KhtoKh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KhtoKh);
						break;
					case 3:
						CONRESULT_SPEED = (valintSpeed*0.911344);
						String KhtoFs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KhtoFs);
						break;
					case 4:
						CONRESULT_SPEED = (valintSpeed*0.539957);
						String KhtoKnt = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KhtoKnt);
						break;	

					default:
						break;
					}
				}
				else if (FROM_SPEED==3)
				{
					switch (TO_SPEED) {
					case 0:
						CONRESULT_SPEED = (valintSpeed*0.681818);
						String FstoMh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(FstoMh);
						break;	
					case 1:
						CONRESULT_SPEED = (valintSpeed* 0.3047999902464);
						String FstoMs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(FstoMs);
						break;	
					case 2:
						CONRESULT_SPEED = (valintSpeed* 1.09728);
						String FstoKh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(FstoKh);
						break;	
					case 3:
						CONRESULT_SPEED = (valintSpeed);
						String FstoFs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(FstoFs);
						break;	
					case 4:
						CONRESULT_SPEED = (valintSpeed* 0.592484);
						String FstoKnt = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(FstoKnt);
						break;	
						
						
					
					default:
						break;
					}
				}
				else if (FROM_SPEED==4)
					
				{
					switch (TO_SPEED) {
			
					case 0:
						CONRESULT_SPEED = (valintSpeed* 1.15078);
						String KnttoMh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KnttoMh);
						break;	
					case 1:
						CONRESULT_SPEED = (valintSpeed* 0.514444);
						String KnttoMs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KnttoMs);
						break;	
					case 2:
						CONRESULT_SPEED = (valintSpeed* 1.852);
						String KnttoKh = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KnttoKh);
						break;	
					
					case 3:
						CONRESULT_SPEED = (valintSpeed* 1.68781);
						String KnttoFs = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KnttoFs);
						break;	
				
					case 4:
						CONRESULT_SPEED = (valintSpeed);
						String KnttoKnt = Double.toString(CONRESULT_SPEED);
						setMsgSpeed(KnttoKnt);
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
		
		
		
		
		
		
		
		
		spfromSspeed.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				FROM_SPEED=position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
			
			}
		});
		
		sptoSspeed.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				TO_SPEED=position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public void setMsgSpeed(String s1) {
		
		fgspeed.setInFragmentSpeed(s1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.speed, menu);
		return true;
	}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.speed_more:
		Intent isp = new Intent(Speed.this,Select_Conversion.class);
		startActivity(isp);
		
		break;
	case R.id.speed_refresh:
		etvalueSpeed.setText("");
		break;
	case R.id.speed_exit:
		Intent i4=new Intent(getBaseContext(),Select_Conversion.class);
		i4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		i4.putExtra("exit", true);
		startActivity(i4);
		return true;

		
	default:
		
		break;
	}
	
	
	
	
	
	
	return super.onOptionsItemSelected(item);
}
}
