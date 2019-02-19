package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFirstname, etLastname, etAddress, etEmail;
    private EditText etPhone, etPassword, etConfirmPassword;
    private Spinner spGender;
    private Button btnSignup;
    private  String firstname, lastname, address, email, phone, password, gender;
//    private EditText etLastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        etFirstname = (EditText) findViewById(R.id.etFirstname);
        etFirstname = findViewById(R.id.etFirstname);
        etLastname = findViewById(R.id.etLastname);
        etAddress = findViewById(R.id.etAddess);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        spGender = findViewById(R.id.spGender);
        btnSignup = findViewById(R.id.btnSignup);



        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validate();

                Toast.makeText(getApplicationContext(), "you just clicked a button. Loading ...", Toast.LENGTH_LONG).show();
            }
        });


    }

    private void validate() {
        firstname = etFirstname.getText().toString().trim();
        lastname = etLastname.getText().toString().trim();
    }
}
