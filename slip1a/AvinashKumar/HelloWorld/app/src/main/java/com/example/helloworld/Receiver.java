package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Receiver extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        textView = findViewById(R.id.textViewReceiver);

        Intent receiverIntent = getIntent();
        String receivedValue = receiverIntent.getStringExtra("SENDER");
        textView.setText(receivedValue);
    }
}