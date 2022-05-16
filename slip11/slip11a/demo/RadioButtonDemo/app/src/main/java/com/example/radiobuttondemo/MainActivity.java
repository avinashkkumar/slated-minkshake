package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton male,female,yes,no;

    TextView textView;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView = findViewById(R.id.display);
      /*  male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMethod();
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMethod();
            }
        }); */
    }
    public void showMethod(View view){
        str = "Male : "+male.isChecked()+"\n Female : "+female.isChecked();
        str = str+"\nYes : "+yes.isChecked()+"\n No : "+no.isChecked();
        textView.setText(str.toString());

        Toast toast = Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG);
        toast.setMargin(200,100);
        toast.show();
    }
}