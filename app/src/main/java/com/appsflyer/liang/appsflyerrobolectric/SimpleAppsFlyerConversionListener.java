package com.appsflyer.liang.appsflyerrobolectric;

import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;


public class SimpleAppsFlyerConversionListener implements AppsFlyerConversionListener {

    @Override
    public void onInstallConversionDataLoaded(Map<String, String> map) {
        Log.i(AppsFlyerLib.LOG_TAG, "[onInstallConversionDataLoaded]");
        for (String key: map.keySet()) {
            Log.i(AppsFlyerLib.LOG_TAG, key + ":" + map.get(key));
        }
    }

    @Override
    public void onInstallConversionFailure(String s) {
        Log.i(AppsFlyerLib.LOG_TAG, "[onInstallConversionFailure]: " + s);
    }

    @Override
    public void onAppOpenAttribution(Map<String, String> map) {
        Log.i(AppsFlyerLib.LOG_TAG, "[onAppOpenAttribution]");
        for (String key: map.keySet()) {
            Log.i(AppsFlyerLib.LOG_TAG, key + ":" + map.get(key));
        }
        MyApp.ConversionData.putAll(map);
    }

    @Override
    public void onAttributionFailure(String s) {
        Log.i(AppsFlyerLib.LOG_TAG, "[onAttributionFailure]: " + s);

    }
}
