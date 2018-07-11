package com.applitools.testeyesproject.adapter;

public class AdapterItem {

    private String mText;
    private int mColor;

    public AdapterItem(String text, int color) {
        mText = text;
        mColor = color;
    }

    public String getText() {
        return mText;
    }

    public int getColor() {
        return mColor;
    }
}
