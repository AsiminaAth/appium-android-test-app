package com.applitools.testeyesproject;

import android.support.test.rule.ActivityTestRule;

import com.applitools.eyes.android.espresso.Eyes;

import org.junit.Rule;
import org.junit.Test;

public class MapTest extends BaseTest {

    private static final int TEST_NUMBER = 2;
    @Rule
    public ActivityTestRule<MapsActivity> mActivityRule = new ActivityTestRule(MapsActivity.class);

    @Test
    public void testMap() {
        Eyes eyes = new Eyes();
        eyes.setApiKey(API_KEY);  // You can use your own ApiKey
        try {
            eyes.open("Test Map " + TEST_NUMBER);
            eyes.setForceFullPageScreenshot(false);

            eyes.checkGoogleMapFragment(R.id.map, true);

            eyes.close();
        } finally {
            eyes.abortIfNotClosed();
        }
    }
}
