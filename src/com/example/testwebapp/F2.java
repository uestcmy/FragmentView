package com.example.testwebapp;




import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class F2 extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstenceState){
		View mainView = (View)inflater.inflate(R.layout.f2,container,false);
		WebView webview_f2 = (WebView)mainView.findViewById(R.id.webView1);
		//webview_f2.loadUrl("http://www.baidu.com");
		webview_f2.loadUrl("http://140.118.235.3/ServerForAndroid/");
		return mainView;
	}
}
