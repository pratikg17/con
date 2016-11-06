package com.example.convertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResultTemp extends Fragment {
	TextView tvftemp;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View vtemp =inflater.inflate(R.layout.fragment_result_temp, container, false);
		tvftemp = (TextView) vtemp.findViewById(R.id.tvRESULTTEMP);
		
		
		return vtemp;
		
	}
	public void setInFragmentTemp(String s1) {
		tvftemp.setText(s1);
	}
	
	
}
