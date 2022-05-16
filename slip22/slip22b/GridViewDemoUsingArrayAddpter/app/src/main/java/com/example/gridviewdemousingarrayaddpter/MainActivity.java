package com.example.gridviewdemousingarrayaddpter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String str[ ] = {"Mon","Tue","Wed","Thus","Fri","Sat","Sun","Hol","Week"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.myGrid);
        ArrayAdapter  arrayAdapter = new ArrayAdapter(this,R.layout.gridview_layout,R.id.myGridText,str);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"U Clicked "+arrayAdapter.getItem(position),Toast.LENGTH_LONG).show();
            }
        });


    }
}