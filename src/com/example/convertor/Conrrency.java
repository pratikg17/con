
package com.example.convertor;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
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
import android.widget.TextView;
import android.widget.Toast;

public class Conrrency extends Activity {
	int FROM ,TO;
	long conRESULT;

	FragmentResult fRes;
	Spinner spfrom,spto;
	ImageButton ibconvert ;
	EditText etvalue;
	TextView tvRates;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_conrrency);
		tvRates = (TextView) findViewById(R.id.tvrates_c);
		fRes= (FragmentResult) getFragmentManager().findFragmentById(R.id.fragResult);
		spfrom =(Spinner) findViewById(R.id.spinner_from);
		spto =(Spinner) findViewById(R.id.spinner_to);
		String[] curen = getResources().getStringArray(R.array.Currency);
		ArrayAdapter<String> frmadapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_spinner_dropdown_item,curen);
		spfrom.setAdapter(frmadapter);
		ArrayAdapter<String> toadapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_spinner_dropdown_item,curen);
		spto.setAdapter(toadapter);
		
		ibconvert =(ImageButton) findViewById(R.id.convertImgButton);
		etvalue = (EditText) findViewById(R.id.etConvertCurrency);
		
		
		
		ibconvert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View ibV) {
				// TODO Auto-generated method stub
				
				if(etvalue.getText().length()!=0)
				
				{
					String val= etvalue.getText().toString();
					int valint =Integer.parseInt(val);
			
					if(FROM==0)
					{
					switch (TO) {
					case 0:
						conRESULT=valint;
						String ItoI = Float.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoI,Toast.LENGTH_LONG).show();
						setMsg(ItoI);
						tvRates.setText("");
						break;
					case 1:
						conRESULT = (long) (valint*0.015);
						
						String ItoU = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(ItoU);
						tvRates.setText("1 USD = Rs.68.504792");
						break;
						
					case 2:
						conRESULT = (long) (valint*0.010);
						String ItoGP = Float.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoGP,Toast.LENGTH_LONG).show();
						setMsg(ItoGP);
						tvRates.setText("1 GBP = Rs.98.006834");
						break;
						
					case 3:
						conRESULT = (long) (valint*0.013);
						String ItoE = Float.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoE,Toast.LENGTH_LONG).show();
						setMsg(ItoE);
						tvRates.setText("1 Euro = Rs.76.304963");
						break;
						
					case 4:
						conRESULT = (long) (valint*1.64);
						String ItoJY = Float.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoJY,Toast.LENGTH_LONG).show();
						setMsg(ItoJY);
						tvRates.setText("1 JPY = Rs.1.64");
						break;
								
					case 5:
						conRESULT = (long) (valint*0.095);
						String ItoCY = Float.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoCY,Toast.LENGTH_LONG).show();
						setMsg(ItoCY);			
						tvRates.setText("1 CNY = Rs.0.095");
						break;
						
					default:
						break;
					}
				}//END OF FIRST inner IF
				else if  (FROM==1)
				{
				
					switch (TO) {
					case 0:
						conRESULT = (long) (valint*68.504792);
						String ItoU = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(ItoU);
						tvRates.setText("1 USD = Rs.68.504792");
						break;
						
					case 1:
						conRESULT = valint;
						String UtoU = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(UtoU);
						tvRates.setText("");
						break;
							
						
					case 2:
						conRESULT = (long) (valint*	0.699029);
						String UtoG = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(UtoG);
						tvRates.setText("1 USD = GBP 0.699029");
						break;
						
					case 3:
						conRESULT = (long) (valint*	0.897946);
						String UtoE = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(UtoE);
						tvRates.setText("1 USD = EURO 0.897946");
						break;
						
					case 4:
						conRESULT = (long) (valint*	113.80);
						String UtoJP = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(UtoJP);
						tvRates.setText("1 USD = JPY 113.80");
						break;
							
					case 5:
						conRESULT = (long) (valint*	6.52);
						String UtoCY = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(UtoCY);
						tvRates.setText("1 USD = CNY 6.52");
						break;
							

					default:
						break;
					}
					
				}
				else  if(FROM==2)
				{
					switch (TO) {
					
					case 0:
						conRESULT = (long) (valint*97.98);
						String GtoI = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(GtoI);
						tvRates.setText("1 GBP = Rs.97.98");
						break;
					case 1:
						conRESULT = (long) (valint*1.43);
						String GtoU = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(GtoU);
						tvRates.setText("1 GBP = USD 1.43");
						break;
					case 2:
						conRESULT = (long) (valint);
						String GtoG = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(GtoG);
						tvRates.setText("");
						break;
					
					case 3:
						conRESULT = (long) (valint*1.29);
						String GtoE = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(GtoE);
						tvRates.setText("1 GBP = EURO 1.29");
						break;
					case 4:
						conRESULT = (long) (valint*163);
						String GtoJ = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(GtoJ);
						tvRates.setText("1 GBP = JPY 163.0");
						break;
					case 5:
						conRESULT = (long) (valint*9.33);
						String GtoC = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(GtoC);
						tvRates.setText("1 GBP = CNY 9.33");
						break;
					default:
						break;
					}
					
				}
				else  if(FROM==3)
				{
					switch (TO) {
					case 0:
						conRESULT = (long) (valint*76.21);
						String EtoI = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(EtoI);
						tvRates.setText("1 EURO = INR 76.21");
						break;
					case 1:
						conRESULT = (long) (valint*1.11);
						String EtoU = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(EtoU);
						tvRates.setText("1 EURO = USD 1.11");
						break;
					case 2:
						conRESULT = (long) (valint*0.78);
						String EtoG = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(EtoG);
						tvRates.setText("1 EURO = GBP 0.78");
						break;
					case 3:
						conRESULT = (long) (valint);
						String EtoE = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(EtoE);
						tvRates.setText("");
						break;
					case 4:
						conRESULT = (long) (valint*126.74);
						String EtoJ = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(EtoJ);
						tvRates.setText("1 EURO = JPY 126.74");
						break;
					case 5:
						conRESULT = (long) (valint*7.25);
						String EtoC = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(EtoC);
						tvRates.setText("1 EURO = CNY 7.25");
						break;
						default:
						break;
					}
					
				}
				else  if(FROM==4)
				{
				switch (TO) {
				case 0:
					conRESULT = (long) (valint*0.60);
					String JtoI = Long.toString(conRESULT);
					//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
					setMsg(JtoI);
					tvRates.setText("1 JPY = INR 0.60");
					break;
				case 1:
					conRESULT = (long) (valint*0.0088);
					String JtoU = Long.toString(conRESULT);
					//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
					setMsg(JtoU);
					tvRates.setText("1 JPY = USD 0.0088");
					break;
				case 2:
					conRESULT = (long) (valint*0.0061);
					String JtoG = Long.toString(conRESULT);
					//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
					setMsg(JtoG);
					tvRates.setText("1 JPY = GBY 0.0061");
					break;
				case 3:
					conRESULT = (long) (valint*0.0079);
					String JtoE = Long.toString(conRESULT);
					//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
					setMsg(JtoE);
					tvRates.setText("1 JPY = EURO 0.0079");
					break;	
				case 4:
					conRESULT = (long) (valint);
					String JtoJ = Long.toString(conRESULT);
					//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
					setMsg(JtoJ);
					tvRates.setText("");
					break;		
				case 5:
					conRESULT = (long) (valint*0.057);
					String JtoC = Long.toString(conRESULT);
					//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
					setMsg(JtoC);
					tvRates.setText("1 JPY = CNY 0.057");
					break;	
					
					
					
				default:
					break;
				}	
				}
				else if(FROM==5)
				{
					switch (TO) {
					case 0:
						conRESULT = (long) (valint*10.50);
						String CtoI = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(CtoI);
						tvRates.setText("1 CNY = INR 10.50");
						break;	
					case 1:
						conRESULT = (long) (valint*0.15 );
						String CtoU = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(CtoU);
						tvRates.setText("1 CNY = USD 0.15 ");
						break;
					case 2:
						conRESULT = (long) (valint*0.11 );
						String CtoG = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(CtoG);
						tvRates.setText("1 CNY = GBY 0.11 ");
						break;
					case 3:
						conRESULT = (long) (valint*0.14 );
						String CtoE = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(CtoE);
						tvRates.setText("1 CNY = EURO 0.14 ");
						break;		
					case 4:
						conRESULT = (long) (valint*17.48  );
						String CtoJ = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(CtoJ);
						tvRates.setText("1 CNY = JPY 17.48");
						break;			
					case 5:
						conRESULT = (long) (valint);
						String CtoC = Long.toString(conRESULT);
						//Toast.makeText(getBaseContext(), ItoU,Toast.LENGTH_LONG).show();
						setMsg(CtoC);
						tvRates.setText("");
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
		
		
		
		spfrom.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				FROM = position;
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		spto.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				TO=position;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public void setMsg(String s) {
		fRes.setInFragment2(s);
	}
	public void cleartext()
	{
		etvalue.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.conrrency, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.currency_more:
			Intent icon = new Intent(Conrrency.this,Select_Conversion.class);
			startActivity(icon);
			
			break;
		case R.id.currency_refresh:
			cleartext();
		
		break;
		case R.id.currency_exit:
			Intent i1=new Intent(getBaseContext(),Select_Conversion.class);
			i1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i1.putExtra("exit", true);
			startActivity(i1);
			return true;

			
		default:
			
			break;
		}
		
		
		return super.onOptionsItemSelected(item);
	}

}
