package com.example.mobi_app.Screen.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mobi_app.R;

public class Bank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        String name=getIntent().getStringExtra("name");
        int image=getIntent().getIntExtra("image",0);
    }
}