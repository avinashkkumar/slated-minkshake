package com.example.slip1b;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

button=findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        new Mytask(MainActivity.this).execute();

    }
});

    }

    public class Mytask extends AsyncTask<Void,Integer,String>{
ProgressDialog progressDialog;

Context context;

        public Mytask(Context context) {
            this.context = context;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog=new  ProgressDialog(context);
            progressDialog.setCancelable(false);
            progressDialog.setMessage("Marks downloading");
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setProgress(0);
            progressDialog.setMax(100);
            progressDialog.show();
        }

        @Override
        protected String doInBackground(Void... params) {


            for (int i = 0; i <100 ; i++) {


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                publishProgress(i);

            }


            return "null";
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            progressDialog.setProgress(values[0]);

            progressDialog.setMessage("Downloading"+values[0]+"%");
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressDialog.dismiss();

            Log.e("TAG", "onPostExecute: "+s );
        }
    }

}