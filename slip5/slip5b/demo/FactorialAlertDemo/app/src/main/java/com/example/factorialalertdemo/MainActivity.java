package com.example.factorialalertdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edNum;
    Button btFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum = findViewById(R.id.edNum);
        btFind = findViewById(R.id.btFind);
        btFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(edNum.getText().toString());
                int f = 1;
                for(int i = 1;i<=num;i++)
                     f = f * i;
                final AlertDialog.Builder myAlert = new AlertDialog.Builder(MainActivity.this);
                myAlert.setTitle("Factorial Demo")
                        .setMessage("The Facorial of "+num+" = "+f)
                        .setCancelable(true)
                        .setIcon(R.drawable.myhome)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                myAlert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"U Pressed on Cancel ",Toast.LENGTH_LONG).show();
                    }
                });

                myAlert.setNeutralButton("Retry", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"U Pressed on Neutral ",Toast.LENGTH_LONG).show();
                    }
                });

myAlert.create();
myAlert.show();

            }
        });
    }
}