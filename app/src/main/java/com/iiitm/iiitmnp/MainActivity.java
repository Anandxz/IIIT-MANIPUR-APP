package com.iiitm.iiitmnp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // JavaScript सपोर्ट ऑन करें

        webView.setWebViewClient(new WebViewClient()); // लिंक ऐप के अंदर ही खुलेंगे
        webView.loadUrl("https://www.iiitmanipur.ac.in/"); // IIITM वेबसाइट लोड करें
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); // बैक बटन दबाने पर पहले वाले पेज पर जाएं
        } else {
            super.onBackPressed();
        }
    }
}
