package com.appsflyer.liang.appsflyerrobolectric;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {
    @Test
    public void checkConversionData() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        TextView textViewConversion = activity.findViewById(R.id.textViewConversion);
        assertNotNull(textViewConversion.getText());
        assertTrue(textViewConversion.getText().toString().startsWith("version:"));
    }

}
