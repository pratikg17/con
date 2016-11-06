package com.example.convertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResultSpeed extends Fragment {
	TextView tvfspeed;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	View vspeed = inflater.inflate(R.layout.fragment_result_speed,container,false);
	tvfspeed = (TextView) vspeed.findViewById(R.id.tvRESULTSPEED);
	
	return vspeed;
			
	
	
	}
	public void setInFragmentSpeed(String s1) {
		tvfspeed.setText(s1);
	}
	
}
