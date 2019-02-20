package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {
    private Handler mHandler = new Handler();


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splashscreen);
            mHandler.postDelayed(new Runnable() {

                @Override
                public void run() {
                    Intent intent = new Intent(Splashscreen.this,Login.class);
                    startActivity(intent);
                }
            }, 3000); // 3 seconds
        }
    }



