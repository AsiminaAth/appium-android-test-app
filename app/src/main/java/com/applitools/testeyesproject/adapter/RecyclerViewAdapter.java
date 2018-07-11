package com.applitools.testeyesproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.applitools.testeyesproject.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<AdapterItem> mList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public CardView mCardView;
        public ViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.info_text);
            mCardView = v.findViewById(R.id.card_view);
        }
    }

    public RecyclerViewAdapter(List<AdapterItem> list) {
        mList = list;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inflate_adapter_view_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mList.get(position).getText());
        holder.mCardView.setCardBackgroundColor(mList.get(position).getColor());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
