package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Student_login extends AppCompatActivity implements View.OnClickListener {


    Button loginButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        loginButton = (Button) findViewById(R.id.studentButton);
        loginButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent studentIntent = new Intent(Student_login.this, Student_registation.class);
        startActivity(studentIntent);
    }
}