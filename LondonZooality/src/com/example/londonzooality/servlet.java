package com.example.londonzooality;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class servlet extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servlet);

String url = "http://134.83.83.28:47200/LondonZoo?action=quizzes";
WebView webView = (WebView) findViewById(R.id.webview);
webView.loadUrl(url);
		}
}
