package com.example.testwebapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity  {

	Button btn1,btn2,btn3;
	Button btn_exit;
	Fragment fragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn_exit = (Button)findViewById(R.id.exit);
        
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        
        S0 myFrag = new S0();
        ft.add(R.id.FirstFragment, myFrag);
        ft.commit();
        
        btn1.setOnClickListener(btnOnClickListener);
        btn2.setOnClickListener(btnOnClickListener);
        btn3.setOnClickListener(btnOnClickListener);
        
       
	}
	
	Button.OnClickListener btnOnClickListener = new Button.OnClickListener(){
		@Override
		public void onClick(View v){
			Fragment newfrag = new F1();
			if( v == btn1 ){
				newfrag = new F1();
				CharSequence text = "Tag1";
                Toast t1 = Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT);
                t1.show();
			}else if( v == btn2 ){
				newfrag = new F2();
				CharSequence text = "Tag2";
                Toast t1 = Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT);
                t1.show();
			}else if( v == btn3 ){
				CharSequence text = "Tag3";
                Toast t1 = Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT);
                t1.show();
				newfrag = new F3();
			}
			FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
			trans.replace(R.id.FirstFragment, newfrag);
			trans.addToBackStack(null);
			trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			trans.commit();
			
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override 
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.exit: 
				new AlertDialog.Builder(MainActivity.this).setTitle(R.string.exit_menu)
				.setMessage(R.string.exit_message)
				.setPositiveButton(R.string.exit_submit, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						// TODO Auto-generated method stub
						MainActivity.this.finish();
					}
				})
				.setNegativeButton(R.string.exit_cancel, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						// TODO Auto-generated method stub
						dialog.cancel();
					}
				})
				.setCancelable(false)
				.show();
			
		}
		return true;
	}

}
