package com.appsflyer.liang.appsflyerrobolectric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.appsflyer.AppsFlyerLib;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textViewConversion);
        textView.setText(AppsFlyerLib.getInstance().getSdkVersion());


    }
}
