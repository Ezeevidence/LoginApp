package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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
    private  String firstname, lastname, address, email, phone, password, gender, confirm, fullname;
    private String message;
//    private EditText etLastname;

    private Utils util;

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
        util = new Utils();



        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validate();

                Toast.makeText(getApplicationContext(), " Loading ...", Toast.LENGTH_LONG).show();
            }
        });


    }

    private void validate() {
        firstname = etFirstname.getText().toString().trim();
        lastname = etLastname.getText().toString().trim();
        address = etAddress.getText().toString().trim();
        email = etEmail.getText().toString().trim();
        phone = etPhone.getText().toString().trim();
        password = etPassword.getText().toString().trim();
        confirm = etPassword.getText().toString().trim();
//        gender = spGender.getSelectedItem().toString();


        if (TextUtils.isEmpty(firstname)) {
             message = "first name cannot be empty";
            etFirstname.setError(message);
            return;
        }
        if (TextUtils.isEmpty(lastname)) {
             message = "last name cannot be empty";
            etLastname.setError(message);
            return;
        }
        if (!util.isValidEmail(getApplicationContext(), email)) {
            message =  "email cannot be empty";
            etEmail.setError(message);
            return;
        }

        if (!util.isValidPhoneNumber(getApplicationContext(), phone)) {
            message = "phone cannot be empty";
            etPhone.setError(message);
            return;
        }
        if (phone.length() < 11) {
            etPhone.setError("incomplete phone number");
            return;
        }
        if (!phone.startsWith("0")) {
            etPhone.setError("incorrect phone nmber entered");
            return;
        }
        if ((TextUtils.isEmpty(password)) && password.length() < 8) {
            etPassword.setError("password cannot be empty or less than 8");
            return;
        }
        if (password != confirm) {
            etConfirmPassword.setError("incorrect passowrd");
        } else {
            startActivity(new Intent(MainActivity.this, Welcome.class));
            Toast.makeText(this, "Details entered correctly", Toast.LENGTH_SHORT).show();
        }







    }
}
