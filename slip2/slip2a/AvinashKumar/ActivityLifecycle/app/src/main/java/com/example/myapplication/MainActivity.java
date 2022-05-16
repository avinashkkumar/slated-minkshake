package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", "Activity Started" );
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle","The thread is started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle","The thread is resumed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle","The Thread is destroyed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Lifecycle","The Thread is restarted");
    }
}