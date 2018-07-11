package com.applitools.testeyesproject;


import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import com.applitools.eyes.android.espresso.Eyes;

import org.junit.Rule;
import org.junit.Test;

public class CheckRegionTest extends BaseTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void test() {
        Eyes eyes = new Eyes();
        eyes.setApiKey(API_KEY); // You can use your own ApiKey
        try {
            eyes.open("Check Region Test");

            eyes.checkRegion(ViewMatchers.withId(R.id.scroll_view));

            eyes.close();
        } finally {
            eyes.abortIfNotClosed();
        }
    }
}
