package com.applitools.testeyesproject.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.applitools.testeyesproject.R;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    private List<AdapterItem> mList;
    private LayoutInflater mLayoutInflater;

    public GridViewAdapter(Context context, List<AdapterItem> list) {
        mList = list;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.inflate_adapter_view_item, null);

        TextView textView = view.findViewById(R.id.info_text);
        CardView cardView = view.findViewById(R.id.card_view);

        textView.setText(mList.get(position).getText());
        cardView.setCardBackgroundColor(mList.get(position).getColor());

        return view;
    }
}
