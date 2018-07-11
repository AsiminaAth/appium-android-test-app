package com.applitools.testeyesproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int COUNT = 285;
    ScrollView mScrollView;
    LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        fillData();
    }

    private void initializeViews() {
        mScrollView = findViewById(R.id.scroll_view);
        mContainer = findViewById(R.id.container);
    }

    private void fillData() {
        for (int i = 0; i < COUNT; i++) {
            mContainer.addView(buildView(i));
            mContainer.invalidate();
        }
    }

    private View buildView(int position) {
        TextView textView = new TextView(mContainer.getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 50));
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setBackgroundColor(getBGColor(position));
        textView.setTextColor(Color.BLACK);
        textView.setText(String.valueOf(position));
        return textView;
    }

    private int getBGColor(int position) {
        if (position % 2 > 0) {
            return Color.parseColor("#66c8c5");
        } else {
            return Color.parseColor("#6669c7");
        }
    }
}
