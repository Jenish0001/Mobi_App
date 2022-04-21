package com.example.mobi_app.Screen.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mobi_app.R;
import com.example.mobi_app.Screen.controller.MyRvAdpter;

public class Recycle_View extends AppCompatActivity {

    private RecyclerView rv_view;
    String[] city = {"surat", "Amdavad", "Rajkot", "baroda", "gondal", "amreli", "kamadhiya", "delhi", "goa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        blinding();
        MyRvAdpter adapter = new MyRvAdpter(Recycle_View.this, city);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Recycle_View.this);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(adapter);

    }

    private void blinding() {

        rv_view = findViewById(R.id.rv_view);

    }
}