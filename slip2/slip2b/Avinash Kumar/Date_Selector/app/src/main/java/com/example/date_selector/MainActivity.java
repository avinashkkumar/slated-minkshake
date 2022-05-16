package com.example.date_selector;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker Date;
    TextView textview;
    Button Submit, btDialog;
    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date = (DatePicker) findViewById(R.id.Date);
        textview = (TextView) findViewById(R.id.textView);
        Submit = (Button) findViewById(R.id.submit);
        btDialog = findViewById(R.id.btDialog);

        Submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){showDate();}
        });

        btDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ showMyDate();};
            });
        }

    private void showMyDate() {
        final Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                textview.setText(d + "/" + m + "/" + y);
            }
        },y,m,d);
        datePickerDialog.show();
    };

    private void showDate() {

        int d = Date.getDayOfMonth();
        int m = Date.getMonth();
        int y = Date.getYear();

        textview.setText("Selected date : " + d + "/" + (m+1) +"/" + y);
    }
}