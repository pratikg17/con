package com.example.convertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResult extends Fragment {
	TextView tv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		View v =inflater.inflate(R.layout.fragment_result,container,false);
		tv = (TextView) v.findViewById(R.id.tvRESULT);
		return v;
		
	}
	public void setInFragment2(String s) {
		tv.setText(s);
	}
	
	
	
}
