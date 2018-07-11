package com.applitools.testeyesproject;

import android.support.test.rule.ActivityTestRule;
import com.applitools.eyes.android.espresso.Eyes;

import org.junit.Rule;
import org.junit.Test;

public class AppTest extends BaseTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void test() {
        Eyes eyes = new Eyes();
        eyes.setApiKey(API_KEY); // You can use your own ApiKey
        try {
            eyes.open("Eyes Test 5");

            eyes.checkWindow();

            eyes.close();
        } finally {
            eyes.abortIfNotClosed();
        }
    }
}
