package com.example.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch bt,wf;
    TextView display;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.swBT);
        wf = findViewById(R.id.swWF);
        display = findViewById(R.id.display);
        display.setTextSize(24);
        display.setTextColor(Color.RED);
        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked())
                {
                    display.setText("Wel Come as ur Toggle Button is "+toggleButton.getTextOn());
                }
                else
                {
                    display.setText("Sorry!.... Toggle Button is "+toggleButton.getTextOff());
                }
            }
        });


      bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(bt.isChecked() == true)
                {
                    Toast.makeText(getApplicationContext(),"BlueTooth is  "+bt.getTextOn(),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"BlueTooth is  "+bt.getTextOff(),Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    private void btOff() {
        Toast.makeText(getApplicationContext(),"BlueTooth is OFF ",Toast.LENGTH_LONG).show();
    }

    private void btON() {
        Toast.makeText(getApplicationContext(),"BlueTooth is On ",Toast.LENGTH_LONG).show();
    }
}