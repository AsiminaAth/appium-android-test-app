package com.applitools.testeyesproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.applitools.testeyesproject.adapter.AdapterItem;
import com.applitools.testeyesproject.adapter.GridViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        initGridView();
    }

    private void initGridView() {
        mGridView = findViewById(R.id.grid_view);

        GridViewAdapter adapter = new GridViewAdapter(this, getData());

        mGridView.setAdapter(adapter);
    }

    private List<AdapterItem> getData() {
        List<AdapterItem> list = new ArrayList<>();
        list.add(new AdapterItem("Item 1", Color.parseColor("#33CC00")));
        list.add(new AdapterItem("Item 2", Color.parseColor("#33CC66")));
        list.add(new AdapterItem("Item 3", Color.parseColor("#33CCCC")));
        list.add(new AdapterItem("Item 4", Color.parseColor("#993366")));
        list.add(new AdapterItem("Item 5", Color.parseColor("#003399")));
        list.add(new AdapterItem("Item 6", Color.parseColor("#006600")));
        list.add(new AdapterItem("Item 7", Color.parseColor("#CC3300")));
        list.add(new AdapterItem("Item 8", Color.parseColor("#FF9A00")));
        list.add(new AdapterItem("Item 9", Color.parseColor("#50342C")));
        list.add(new AdapterItem("Item 10", Color.parseColor("#5F7D8E")));
        list.add(new AdapterItem("Item 11", Color.parseColor("#FFCD00")));
        return list;
    }
}
