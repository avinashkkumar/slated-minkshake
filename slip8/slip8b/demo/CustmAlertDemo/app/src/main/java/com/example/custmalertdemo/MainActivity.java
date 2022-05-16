package com.example.custmalertdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    TextView txtDisplay;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btShow);
        txtDisplay = findViewById(R.id.txtDisplay);
        // add button listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
               // dialog.setContentView(R.layout.custom);
                dialog.setContentView(R.layout.cust);
               // Button dialogButton = (Button) dialog.findViewById(R.id.btExit);
                Button btGanesh = dialog.findViewById(R.id.btGanesh);
                Button btRakesh = dialog.findViewById(R.id.btRakesh);
                Button btRamesh = dialog.findViewById(R.id.btRamesh);

                // if button is clicked, close the custom dialog
 /*               dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(),"Dismissed..!!",Toast.LENGTH_SHORT).show();
                    }
                }); */

                btGanesh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        txtDisplay.setText("U R Friend Name : Ganesh");
                    }
                });
                btRakesh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        txtDisplay.setText("U R Friend Name : Rakesh");
                    }
                });
                btRamesh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        txtDisplay.setText("U R Friend Name : Ramesh");
                    }
                });
                dialog.show();
            }
        });
    }
}