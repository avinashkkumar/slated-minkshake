package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAdd,btnSubtract,btnMultiply,btnDivide;
    EditText v1,v2;
    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        txtDisplay = findViewById(R.id.txtDisplay);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(v1.getText().toString());
                int b = Integer.parseInt(v2.getText().toString());
                int c = a + b;
                txtDisplay.setText("Addition : " + c);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(v1.getText().toString());
                int b = Integer.parseInt(v2.getText().toString());
                int c = a - b;
                txtDisplay.setText("Subtraction is : " + c);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(v1.getText().toString());
                int b = Integer.parseInt(v2.getText().toString());
                int c = a * b;
                txtDisplay.setText("Multiplication is : " + c);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(v1.getText().toString());
                int b = Integer.parseInt(v2.getText().toString());
                int c = a / b;
                txtDisplay.setText("Division is : " + c);
            }
        });

    }
}