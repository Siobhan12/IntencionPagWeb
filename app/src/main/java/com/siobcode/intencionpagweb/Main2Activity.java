package com.siobcode.intencionpagweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView webView = (WebView) findViewById(R.id.web1);
        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        webView.loadUrl(dato);

        Button btnTermina = (Button) findViewById(R.id.btnfinalizar);
        btnTermina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
        public class WebViewController extends WebViewClient {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true; }
    }
    }
