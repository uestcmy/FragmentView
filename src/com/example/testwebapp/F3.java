package com.example.testwebapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F3 extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstenceState){
		return inflater.inflate(R.layout.f3,container,false);
	}
}
