package com.example.mobi_app.Screen.controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mobi_app.R;
import com.example.mobi_app.Screen.View.Recycle_View;

public class MyRvAdpter extends RecyclerView.Adapter<MyRvAdpter.ViewData> {
    Activity activity;
    String[] city;

    public MyRvAdpter(Recycle_View recycle_view, String[] city) {

        activity = recycle_view;
        this.city = city;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_rv, parent, false);
        ViewData viewData = new ViewData(view);

        return viewData;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
        holder.txt.setText(city[position]);
    }

    @Override
    public int getItemCount() {
        return city.length;
    }

    class ViewData extends RecyclerView.ViewHolder {

        TextView txt;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.txt);
        }
    }


}
