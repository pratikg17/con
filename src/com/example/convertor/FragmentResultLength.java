package com.example.convertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResultLength extends Fragment{

TextView tvflength;
	@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
View vlength = inflater.inflate(R.layout.fragment_result_length,container,false);
tvflength=(TextView) vlength.findViewById(R.id.tvRESULTLENGTH);
return vlength;
 
	
	}
	public void setInFragmentLength(String s1)
	{
		tvflength.setText(s1);
	}
}
