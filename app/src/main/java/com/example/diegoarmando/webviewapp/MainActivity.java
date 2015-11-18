package com.example.diegoarmando.webviewapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.setWebChromeClient(new WebChromeClient() {
        });
        view.loadUrl("http://www.multimedios.com/tv/envivo/monterrey");
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public  boolean shouldOverrideUrlLoading(WebView view, String url ) {
            view.loadUrl(url);
            return true;
        }}}

