package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
     String myList [] = {"Satish","Rakesh","Rajesh","Suresh","Dinesh","Kamlesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.simpleList);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.activity_simple_list_view,R.id.textView,myList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = (String) arrayAdapter.getItem(position);
                Toast.makeText(MainActivity.this,"U clicked on "+str,Toast.LENGTH_LONG).show();
            }
        });


    }
}