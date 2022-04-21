package com.example.mobi_app.Screen.controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobi_app.R;
import com.example.mobi_app.Screen.View.MainActivity;


public class MyAdapter extends BaseAdapter {
    int[] image;
    Activity activity;
    String[] bank;

    public MyAdapter(MainActivity mainActivity, String[] bank, int[] image) {
        activity = mainActivity;
        this.bank = bank;
        this.image = image;

    }

    @Override
    public int getCount() {
        return bank.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(activity).inflate(R.layout.item, viewGroup, false);
        TextView txt1 = view1.findViewById(R.id.txt1);
        ImageView img = view1.findViewById(R.id.img);

        txt1.setText(bank[i]);
        img.setImageResource(image[i]);

        return view1;
    }
}
