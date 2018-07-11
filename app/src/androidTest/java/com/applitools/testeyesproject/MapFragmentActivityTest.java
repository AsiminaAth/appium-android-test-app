package com.applitools.testeyesproject;

import android.support.test.rule.ActivityTestRule;

import com.applitools.eyes.android.espresso.Eyes;

import org.junit.Rule;
import org.junit.Test;

public class MapFragmentActivityTest extends BaseTest {

    private static final int TEST_NUMBER = 2;
    @Rule
    public ActivityTestRule<MapFragmentActivity> mActivityRule = new ActivityTestRule(MapFragmentActivity.class);

    @Test
    public void testMapFragmentActivity() {
        Eyes eyes = new Eyes();
        eyes.setApiKey(API_KEY);  // You can use your own ApiKey
        try {
            eyes.open("Test Map Fragment Activity " + TEST_NUMBER);
            eyes.setForceFullPageScreenshot(false);

            eyes.checkWindow();

            eyes.close();
        } finally {
            eyes.abortIfNotClosed();
        }
    }
}
