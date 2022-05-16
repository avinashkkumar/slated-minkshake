package com.example.tabledemo07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    EditText edUser,edPass;
    Button btSubmit,btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edUser.getText().toString();
                String pass = edPass.getText().toString();
                if(user.equals("Admin") && pass.equals("Admin"))
                {
      //              Toast.makeText(getApplicationContext(),"Valid User",Toast.LENGTH_LONG).show();
           //         Snackbar.make(this,"Valid User",Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid User name and Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void ResetData(View view)
    {
        edUser.setText("");
        edPass.setText("");
    }
    public void init()
    {
        edUser = findViewById(R.id.edUser);
        edPass = findViewById(R.id.edPass);
        btSubmit = findViewById(R.id.btSubmit);
        btReset = findViewById(R.id.btReset);
    }
}