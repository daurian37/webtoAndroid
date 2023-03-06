package com.example.webtoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView=findViewById(R.id.webview);
        WebSettings webSettings=mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://smeth-dev.site");
        mWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()){

            mWebView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
