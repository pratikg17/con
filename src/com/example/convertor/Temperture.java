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

public class Temperture extends Activity {
int FROM_TEMP,TO_TEMP;
double CONRESULT_TEMP;

Spinner spfromStemp,sptoStemp;
EditText etvalueTemp;
ImageButton ibconvertResultTemp;
FragmentResultTemp frtemp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperture);
		
		frtemp=(FragmentResultTemp) getFragmentManager().findFragmentById(R.id.fragResultTemp);
		
spfromStemp =(Spinner)findViewById(R.id.spinner_fromTemp);
sptoStemp =(Spinner) findViewById(R.id.spinner_toTemp);
String[] tempcon =getResources().getStringArray(R.array.temparray);
ArrayAdapter<String> fromTempAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,tempcon);
spfromStemp.setAdapter(fromTempAdapter);
ArrayAdapter<String> toTempAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item,tempcon);
sptoStemp.setAdapter(toTempAdapter);
etvalueTemp=(EditText) findViewById(R.id.etConvertTempertaure);
ibconvertResultTemp =(ImageButton) findViewById(R.id.convertImgButtonTemp);

ibconvertResultTemp.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View Vbtntemp) {
		// TODO Auto-generated method stub
		if(etvalueTemp.getText().length()!=0)
		{  
			String valtemp = etvalueTemp.getText().toString();
		
		int valintTemp = Integer.parseInt(valtemp);
		if(FROM_TEMP==0)
		{
			switch (TO_TEMP) {
			case 0:
				CONRESULT_TEMP = valintTemp;
				String CtoC =Double.toString(CONRESULT_TEMP);
				setMsgTemp(CtoC);
				break;
			case 1:
				CONRESULT_TEMP = (long) ((valintTemp*1.8)+32);
				String CtoF = Double.toString(CONRESULT_TEMP);
				setMsgTemp(CtoF);
				break;
			case 2:
				CONRESULT_TEMP = (long) ((valintTemp+273.15));
				String CtoK = Double.toString(CONRESULT_TEMP);
				setMsgTemp(CtoK);
				break;
			default:
				break;
			}
		}
		else if(FROM_TEMP==1)
		{
			switch (TO_TEMP) {
			case 0:
				CONRESULT_TEMP = ((valintTemp-32)*0.556);
				String FtoC =Double.toString(CONRESULT_TEMP);
				setMsgTemp(FtoC);
				break;
			case 1:
				CONRESULT_TEMP = valintTemp;
				String FtoF =Double.toString(CONRESULT_TEMP);
				setMsgTemp(FtoF);
				break;
			case 2:
				CONRESULT_TEMP = ((valintTemp+459.67)*(0.555));
				String FtoK =Double.toString(CONRESULT_TEMP);
				setMsgTemp(FtoK);
				break;

				
				
			default:
				break;
			}
		}
		else if(FROM_TEMP==2)
		{
			switch (TO_TEMP) {
			
			case 0:
				CONRESULT_TEMP = (valintTemp-273.15);
				String KtoC =Double.toString(CONRESULT_TEMP);
				setMsgTemp(KtoC);
				break;
			
			case 1:
				CONRESULT_TEMP = ((valintTemp*(9/5)-459.67));
				String KtoF =Double.toString(CONRESULT_TEMP);
				setMsgTemp(KtoF);
				break;
			case 2:
				CONRESULT_TEMP = valintTemp;
				String KtoK =Double.toString(CONRESULT_TEMP);
				setMsgTemp(KtoK);
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




spfromStemp.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> parent, View vfrom, int position,
			long id) {
		// TODO Auto-generated method stub
		FROM_TEMP=position;
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
});


sptoStemp.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> parent, View vto , int position,
			long id) {
		// TODO Auto-generated method stub
		TO_TEMP=position;
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
});


	}
	
	public void setMsgTemp(String s1) {
	
		frtemp.setInFragmentTemp(s1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.temperture, menu);
		return true;
	}
@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.temp_more:
		Intent itmp = new Intent(Temperture.this,Select_Conversion.class);
		startActivity(itmp);
		
		break;
	case R.id.temp_refresh:
		etvalueTemp.setText("");
		break;
	case R.id.temp_exit:
		Intent i5=new Intent(getBaseContext(),Select_Conversion.class);
		i5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		i5.putExtra("exit", true);
		startActivity(i5);
		return true;

		
	default:
		
		break;
	}
	
	
	return super.onOptionsItemSelected(item);
	}
}
