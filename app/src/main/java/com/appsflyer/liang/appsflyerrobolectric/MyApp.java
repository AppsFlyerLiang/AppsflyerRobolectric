package com.appsflyer.liang.appsflyerrobolectric;

import android.app.Application;

import com.appsflyer.AppsFlyerLib;

import java.util.HashMap;
import java.util.Map;

public class MyApp extends Application {
    public static Map<String, String> ConversionData = new HashMap<String, String>();
    @Override
    public void onCreate() {
        super.onCreate();
        AppsFlyerLib.getInstance().init(BuildConfig.AF_DEV_KEY, new SimpleAppsFlyerConversionListener(), this);
        AppsFlyerLib.getInstance().setDebugLog(true);
        AppsFlyerLib.getInstance().startTracking(this);
    }

}
