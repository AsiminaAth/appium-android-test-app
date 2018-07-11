package com.applitools.testeyesproject;

import android.support.test.rule.ActivityTestRule;

import com.applitools.eyes.android.espresso.Eyes;

import org.junit.Rule;
import org.junit.Test;

public class MapViewActivityTest extends BaseTest {

    private static final int TEST_NUMBER = 1;
    @Rule
    public ActivityTestRule<MapViewActivity> mActivityRule = new ActivityTestRule(MapViewActivity.class);

    @Test
    public void testMapViewActivity() {
        Eyes eyes = new Eyes();
        eyes.setApiKey(API_KEY);  // You can use your own ApiKey
        try {
            eyes.open("Test MapView Activity " + TEST_NUMBER);
            eyes.setForceFullPageScreenshot(false);

            eyes.checkWindow();

            eyes.close();
        } finally {
            eyes.abortIfNotClosed();
        }
    }
}
