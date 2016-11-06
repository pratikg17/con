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

public class Length extends Activity {
	int FROM_LENGTH,TO_LENGTH;
	double CONRESULT_LENGTH;
	
	
	Spinner spfromSlength,sptoSlength;
	EditText etvalueLength;
	ImageButton ibconvertResultLength;
	FragmentResultLength fglength;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_length);
		fglength = (FragmentResultLength) getFragmentManager().findFragmentById(R.id.fragResultLength);
		
		spfromSlength = (Spinner) findViewById(R.id.spinner_fromLength);
		sptoSlength= (Spinner) findViewById(R.id.spinner_toLength);
		String[] conlength = getResources().getStringArray(R.array.lengtharray);
		ArrayAdapter<String> fromLengthAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,conlength);
		spfromSlength.setAdapter(fromLengthAdapter);
		ArrayAdapter<String> toLengthAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,conlength);
		sptoSlength.setAdapter(toLengthAdapter);
		
		etvalueLength =(EditText) findViewById( R.id.etConvertLength);
		ibconvertResultLength = (ImageButton) findViewById(R.id.convertImgButtonLength);

		
		ibconvertResultLength.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				

				if(etvalueLength.getText().length()!=0)
				
				{
				String vallength= etvalueLength.getText().toString();
				int valintlength = Integer.parseInt(vallength);
				if(FROM_LENGTH==0)
				{
					switch (TO_LENGTH) {
					case 0:
						CONRESULT_LENGTH = valintlength;
						String KtoK = Double.toString(CONRESULT_LENGTH);
						setMsgLength(KtoK);
						break;
					case 1:
						CONRESULT_LENGTH = (valintlength*1000);
						String KtoM = Double.toString(CONRESULT_LENGTH);
						setMsgLength(KtoM);
						break;
					case 2:
						CONRESULT_LENGTH = (valintlength*100000);
						String KtoC = Double.toString(CONRESULT_LENGTH);
						setMsgLength(KtoC);
						break;
					case 3:
						CONRESULT_LENGTH = (valintlength*10000);
						String KtoD = Double.toString(CONRESULT_LENGTH);
						setMsgLength(KtoD);
						break;

					default:
						break;
					}
				}
				else if(FROM_LENGTH==1)
				{
					switch (TO_LENGTH) {
					case 0:
						CONRESULT_LENGTH = (valintlength*0.001);
						String MtoK = Double.toString(CONRESULT_LENGTH);
						setMsgLength(MtoK);
						break;
					case 1:
						CONRESULT_LENGTH = (valintlength);
						String MtoM = Double.toString(CONRESULT_LENGTH);
						setMsgLength(MtoM);
						break;
					case 2:
						CONRESULT_LENGTH = (valintlength*100);
						String MtoC = Double.toString(CONRESULT_LENGTH);
						setMsgLength(MtoC);
						break;
					case 3:
						CONRESULT_LENGTH = (valintlength*10);
						String MtoD = Double.toString(CONRESULT_LENGTH);
						setMsgLength(MtoD);
						break;

					default:
						break;
					}
				}
				
				else if(FROM_LENGTH==2)
				{
					switch (TO_LENGTH) {
					case 0:
						CONRESULT_LENGTH = (valintlength*1e-5);
						String CtoK = Double.toString(CONRESULT_LENGTH);
						setMsgLength(CtoK);
						break;
					case 1:
						CONRESULT_LENGTH = (valintlength*0.01);
						String CtoM = Double.toString(CONRESULT_LENGTH);
						setMsgLength(CtoM);
						break;
					case 2:
						CONRESULT_LENGTH = (valintlength);
						String CtoC = Double.toString(CONRESULT_LENGTH);
						setMsgLength(CtoC);
						break;
					case 3:
						CONRESULT_LENGTH = (valintlength*0.1);
						String CtoD = Double.toString(CONRESULT_LENGTH);
						setMsgLength(CtoD);
						break;
					default:
						break;
					}
				
				}					
				
				else if(FROM_LENGTH==3)
				{
					switch (TO_LENGTH) {
					case 0:
						CONRESULT_LENGTH = (valintlength*1e-4);
						String DtoK = Double.toString(CONRESULT_LENGTH);
						setMsgLength(DtoK);
						break;
					case 1:
						CONRESULT_LENGTH = (valintlength*0.1);
						String DtoM = Double.toString(CONRESULT_LENGTH);
						setMsgLength(DtoM);
						break;
					case 2:
						CONRESULT_LENGTH = (valintlength*10);
						String DtoC = Double.toString(CONRESULT_LENGTH);
						setMsgLength(DtoC);
						break;
					case 3:
						CONRESULT_LENGTH = (valintlength);
						String DtoD = Double.toString(CONRESULT_LENGTH);
						setMsgLength(DtoD);
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
		
		
		
		
		
		spfromSlength.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				FROM_LENGTH = position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> position) {
				// TODO Auto-generated method stub
				
			}
		});

		
		sptoSlength.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				TO_LENGTH = position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> position) {
				// TODO Auto-generated method stub
				
			}
		});

	}
public void setMsgLength(String s1) {
		
		fglength.setInFragmentLength(s1);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.length, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	
		switch (item.getItemId()) {
		case R.id.length_more:
			Intent ilen = new Intent(Length.this,Select_Conversion.class);
			startActivity(ilen);
			
			break;
		case R.id.length_refresh:
		etvalueLength.setText("");
		break;
		case R.id.length_exit:
			Intent i3=new Intent(getBaseContext(),Select_Conversion.class);
			i3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i3.putExtra("exit", true);
			startActivity(i3);
			return true;

			
		default:
			
			break;
		}
		
		
		
		
		
		
		return super.onOptionsItemSelected(item);
	}

}
