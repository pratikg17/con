package com.example.convertor;

import org.w3c.dom.Text;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResultArea extends Fragment {
TextView tvfarea;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View varea = inflater.inflate(R.layout.fragment_result_area, container,false);
		
		tvfarea = (TextView) varea.findViewById(R.id.tvRESULTAREA);
		return varea;
	
	
	}
	public void setInFragmentArea(String s1) {
		tvfarea.setText(s1);
	}
	
	
	
	
}
