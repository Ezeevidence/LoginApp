package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class splashscreen extends AppCompatActivity {
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

   mHandler.postDelayed(new Runnable() {
       @Override
       public void run() {
           Intent intent = new Intent(splashscreen.this,login.class);
           startActivity(intent);
       }

   }, 6000);
    }
}
