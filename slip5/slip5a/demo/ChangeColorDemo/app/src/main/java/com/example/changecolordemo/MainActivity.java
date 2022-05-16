package com.example.changecolordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDisplay;
    Button btRed, btGreen, btBlue,btYellow,btPurple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDisplay = findViewById(R.id.txtDisplay);
        btBlue = findViewById(R.id.btBlue);
        btGreen = findViewById(R.id.btGreen);
        btRed = findViewById(R.id.btRed);
        btYellow = findViewById(R.id.btYellow);
        btPurple = findViewById(R.id.btPurple);

        btRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setTextColor(Color.RED);
            }
        });

        btBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setTextColor(Color.BLUE);
            }
        });

        btGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setTextColor(Color.GREEN);
            }
        });

    }
    public void setBtPurple(View view)
    {
        txtDisplay.setTextColor(Color.CYAN);
    }
    public void setBtYellow(View view)
    {
        txtDisplay.setTextColor(Color.YELLOW);
    }
}