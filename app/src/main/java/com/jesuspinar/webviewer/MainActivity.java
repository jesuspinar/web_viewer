package com.jesuspinar.webviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private static final String HOME_WEB = "https://duckduckgo.com";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        //Default url
        webView.loadUrl(HOME_WEB);



    }
    //Go back action
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()) webView.goBack();
        super.onBackPressed();
    }

}