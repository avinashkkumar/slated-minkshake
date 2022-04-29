package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText TextSendFiled;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextSendFiled = (EditText) findViewById(R.id.TextSendFiled);
        btn=(Button) findViewById(R.id.Submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=TextSendFiled.getText().toString();
                Intent senderIntent = new Intent(MainActivity.this,Receiver.class);
                senderIntent.putExtra("SENDER" , str);
                startActivity(senderIntent);

            }
        });
    }

    void buttonSenderPressed(View v){
           }
}