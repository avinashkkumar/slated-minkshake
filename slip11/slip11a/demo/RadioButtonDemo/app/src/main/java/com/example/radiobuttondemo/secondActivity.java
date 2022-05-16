package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    RadioButton m,f;
    Button button;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        m = findViewById(R.id.m);
        f = findViewById(R.id.f);
      button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "Male : "+m.isChecked()+"\n Female : "+f.isChecked();
             Toast.makeText(getApplicationContext(),"U Selected "+str,Toast.LENGTH_LONG).show();
            }
        });

    }
}