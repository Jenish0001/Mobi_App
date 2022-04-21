package com.example.mobi_app.Screen.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.mobi_app.R;
import com.example.mobi_app.Screen.controller.MyAdapter;

public class MainActivity extends AppCompatActivity {

    private GridView list_view;
    String bank[]={"BOB","SBI","HDFC","UNION","ICIC","MH","BOB","SBI","HDFC"};
    int[]  image={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        MyAdapter adapter = new MyAdapter(MainActivity.this,bank,image);
        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,Bank.class);
                intent.putExtra("name",bank);
                intent.putExtra("image",image);
                startActivity(intent);
            }
        });
        
    }

    private void blinding() {
        list_view=findViewById(R.id.list_view);
    }
}