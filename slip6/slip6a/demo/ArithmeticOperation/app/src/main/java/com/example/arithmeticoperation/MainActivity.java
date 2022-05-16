package com.example.arithmeticoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDisplay;
    Button btAdd,btSub,btMul,btDiv;
    EditText edA,edB;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

       btAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               a = Integer.parseInt(edA.getText().toString());
               b = Integer.parseInt(edB.getText().toString());
               int c = a+b;
               txtDisplay.setText("Addition : "+c);
           }
       });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(edA.getText().toString());
                b = Integer.parseInt(edB.getText().toString());
                int c = a-b;
                txtDisplay.setText("Subtract : "+c);
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(edA.getText().toString());
                b = Integer.parseInt(edB.getText().toString());
                int c = a*b;
                txtDisplay.setText("Multiply : "+c);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(edA.getText().toString());
                b = Integer.parseInt(edB.getText().toString());
                int c = a/b;
                txtDisplay.setText("Division : "+c);
            }
        });


    }
    public  void init()
    {
        txtDisplay = findViewById(R.id.txtDisplay);
        btAdd = findViewById(R.id.btAdd);
        btSub = findViewById(R.id.btSub);
        btMul = findViewById(R.id.btMul);
        btDiv = findViewById(R.id.btDiv);
        edA = findViewById(R.id.edA);
        edB = findViewById(R.id.edB);
    }
}