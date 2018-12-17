package com.example.joonas.tokavika;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView web;
    EditText searchBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        searchBox = findViewById(R.id.editText);
        web = findViewById(R.id.webbi);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("http://www.lut.fi");

    }
   public void Haku(View v){
        String adress = ("http://"+searchBox.getText().toString().trim());
        web.loadUrl(adress);

    }

    public void Paivita(View v){
        String addres = web.getUrl();
        web.loadUrl(addres);
    }
    public void taakse(View v){
        web.goBack();
    }
    public void eteen(View v){
        web.goForward();
    }
}
