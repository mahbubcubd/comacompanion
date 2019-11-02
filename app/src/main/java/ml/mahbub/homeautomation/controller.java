package ml.mahbub.homeautomation;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class controller extends AppCompatActivity {
    private WebView mWebView;
    private String URL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        Bundle extras = getIntent().getExtras();
        Integer room;
        room=extras.getInt("room");
        if(room==103){
            URL = "https://perceptronlab.com/project/comacompanion";
        }else if (room==104){
            URL = "https://perceptronlab.com/project/comacompanion/datasheet";
        }
        mWebView = findViewById(R.id.iotWeb);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowContentAccess(true);
        mWebView.loadUrl(URL);

    }

}
