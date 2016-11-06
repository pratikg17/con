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

public class Area extends Activity {
	int FROM_AREA,TO_AREA;
	double CONRESULT_AREA;
	
	
	Spinner spfromSarea,sptoSarea;
	EditText etvalueArea;
	ImageButton ibconvertResultArea;
	FragmentResultArea fgarea;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_area);
	fgarea = (FragmentResultArea) getFragmentManager().findFragmentById(R.id.fragResultArea);
	
	spfromSarea = (Spinner) findViewById(R.id.spinner_fromArea);
	sptoSarea= (Spinner) findViewById(R.id.spinner_toArea);
	String[] conarea = getResources().getStringArray(R.array.areaarray);
	ArrayAdapter<String> fromAreaAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,conarea);
	spfromSarea.setAdapter(fromAreaAdapter);
	ArrayAdapter<String> toAreaAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,conarea);
	sptoSarea.setAdapter(toAreaAdapter);
	
	etvalueArea =(EditText) findViewById( R.id.etConvertArea);
	ibconvertResultArea = (ImageButton) findViewById(R.id.convertImgButtonArea);
	
	ibconvertResultArea.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			if(etvalueArea.getText().length()!=0)
			
			{		
			String valarea= etvalueArea.getText().toString();
			int valintarea = Integer.parseInt(valarea);
			if(FROM_AREA==0)
			{
				switch (TO_AREA) {
				case 0:
					CONRESULT_AREA = valintarea;
					String SktoSk = Double.toString(CONRESULT_AREA);
					setMsgTime(SktoSk);
					
					break;
				case 1:
					CONRESULT_AREA = (valintarea*100);
					String SktoH = Double.toString(CONRESULT_AREA);
					setMsgTime(SktoH);
					
					break;
				case 2:
					CONRESULT_AREA = (valintarea*0.386102);
					String SktoSm = Double.toString(CONRESULT_AREA);
					setMsgTime(SktoSm);
					
					break;
				case 3:
					CONRESULT_AREA = (valintarea*247.105);
					String SktoA = Double.toString(CONRESULT_AREA);
					setMsgTime(SktoA);
					
					break;
				default:
					break;
				}
			}
			else if(FROM_AREA==1)
			{
				switch (TO_AREA) {
				case 0:
					CONRESULT_AREA = (valintarea*0.01);
					String HtoSk = Double.toString(CONRESULT_AREA);
					setMsgTime(HtoSk);
					break;
				case 1:
					CONRESULT_AREA = (valintarea);
					String HtoH = Double.toString(CONRESULT_AREA);
					setMsgTime(HtoH);
					break;
				case 2:
					CONRESULT_AREA = (valintarea*0.00386102);
					String HtoSm = Double.toString(CONRESULT_AREA);
					setMsgTime(HtoSm);
					break;
				case 3:
					CONRESULT_AREA = (valintarea*2.47105);
					String HtoA = Double.toString(CONRESULT_AREA);
					setMsgTime(HtoA);
					break;

					
				default:
					break;
				}
			}
			else if(FROM_AREA==2)
			{
				
			switch (TO_AREA) {
			case 0:
				CONRESULT_AREA = (valintarea*2.58999);
				String SMtoSk = Double.toString(CONRESULT_AREA);
				setMsgTime(SMtoSk);
				break;
			case 1:
				CONRESULT_AREA = (valintarea*258.998411217135);
				String SMtoH = Double.toString(CONRESULT_AREA);
				setMsgTime(SMtoH);
				break;
			case 2:
				CONRESULT_AREA = (valintarea);
				String SMtoSM = Double.toString(CONRESULT_AREA);
				setMsgTime(SMtoSM);
				break;
			case 3:
				CONRESULT_AREA = (valintarea*640);
				String SMtoA = Double.toString(CONRESULT_AREA);
				setMsgTime(SMtoA);
				break;
			

			default:
				break;
			}	
				
			}
			else if(FROM_AREA==3)
			{
				switch (TO_AREA) {
				case 0:
					CONRESULT_AREA = (valintarea*0.00404686);
					String AtoSk = Double.toString(CONRESULT_AREA);
					setMsgTime(AtoSk);
					break;
				case 1:
					CONRESULT_AREA = (valintarea*0.404686);
					String AtoH = Double.toString(CONRESULT_AREA);
					setMsgTime(AtoH);
					break;
				case 2:
					CONRESULT_AREA = (valintarea*0.0015625);
					String AtoSm = Double.toString(CONRESULT_AREA);
					setMsgTime(AtoSm);
					break;
				case 3:
					CONRESULT_AREA = (valintarea);
					String AtoA = Double.toString(CONRESULT_AREA);
					setMsgTime(AtoA);
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
	spfromSarea.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View v,
				int position, long id) {
			// TODO Auto-generated method stub
			FROM_AREA = position;
		}

		@Override
		public void onNothingSelected(AdapterView<?> position) {
			// TODO Auto-generated method stub
			
		}
	});

	
	sptoSarea.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View v,
				int position, long id) {
			// TODO Auto-generated method stub
			TO_AREA = position;
		}

		@Override
		public void onNothingSelected(AdapterView<?> position) {
			// TODO Auto-generated method stub
			
		}
	});

	
	
	}
public void setMsgTime(String s1) {
		
		fgarea.setInFragmentArea(s1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.area, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch (item.getItemId()) {
		case R.id.area_more:
			Intent iar = new Intent(Area.this,Select_Conversion.class);
			startActivity(iar);
			
			break;
		case R.id.area_refresh:
			etvalueArea.setText("");
			break;
		case R.id.area_exit:
			Intent i2=new Intent(getBaseContext(),Select_Conversion.class);
			i2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i2.putExtra("exit", true);
			startActivity(i2);
			return true;

			
		default:
			
			break;
		}
		
		
		return super.onOptionsItemSelected(item);
	}

	
}
