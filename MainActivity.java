package com.sdmga.iiuc.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView webview;
    private Button btnClick;
    private TextView tvClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.webviewdemo);
        btnClick = (Button) findViewById(R.id.button);
        tvClick = (TextView) findViewById(R.id.textView);

        webview.setWebViewClient(new WebViewClient());
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               webview.loadUrl(tvClick.getText().toString());
            }
        });

    }
}
