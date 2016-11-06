package com.example.convertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResultTime extends Fragment{
	TextView tvftime;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View vtime = inflater.inflate(R.layout.fragment_result_time, container,false);
		tvftime = (TextView) vtime.findViewById(R.id.tvRESULTTIME);
		return vtime;
	}
	public void setInFragmentTime(String s1) {
		tvftime.setText(s1);
	}
}
