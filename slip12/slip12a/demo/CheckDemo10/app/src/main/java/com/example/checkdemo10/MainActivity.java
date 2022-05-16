package com.example.checkdemo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbAndroid,cbPhp,cbJava,cbCpp;
    Switch aSwitch;
    Button btDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbAndroid = findViewById(R.id.cbAndroid);
        cbPhp = findViewById(R.id.cbPHP);
        cbJava = findViewById(R.id.cbJava);
        cbCpp = findViewById(R.id.cbCpp);
        aSwitch = findViewById(R.id.switch1);
        btDisplay = findViewById(R.id.btDisplay);
        String status = "";
        btDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  status;
                status = "Android : "+cbAndroid.isChecked()+"\nPHP : "+cbPhp.isChecked()+"\nJava : "+cbJava.isChecked()+"\nCPP : "+cbCpp.isChecked();;
                ;
                Toast.makeText(getApplicationContext(),"Selected \n"+status+"\nSwitch "+aSwitch.isChecked(),Toast.LENGTH_LONG).show();
            }
        });
    }

}