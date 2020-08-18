package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button adminlogin;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toast.makeText(Login.this,"Login Successful", Toast.LENGTH_SHORT).show();
        adminlogin = (Button) findViewById(R.id.loginButtonId);
        adminlogin.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent adminIntent = new Intent(Login.this, Add_faculty.class);
        startActivity(adminIntent);
    }
}