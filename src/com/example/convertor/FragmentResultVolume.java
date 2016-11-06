package com.example.convertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentResultVolume extends Fragment{
TextView tvfvolume;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub

	View vvolume = inflater.inflate(R.layout.fragment_result_volume, container,false);
	tvfvolume = (TextView) vvolume.findViewById(R.id.tvRESULTVOLUME);
	
	return vvolume;
}
public void setInFragmentVolume(String s1) {
	tvfvolume.setText(s1);
}
	
	
}
