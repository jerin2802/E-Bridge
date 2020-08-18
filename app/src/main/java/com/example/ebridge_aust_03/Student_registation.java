package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Student_registation extends AppCompatActivity implements View.OnClickListener {


    Button submitButton,back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registation);

        Toast.makeText(Student_registation.this,"Login Successful", Toast.LENGTH_SHORT).show();

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);

        }
    public void onClick(View view) {
        Intent adminIntent = new Intent(Student_registation.this, Notifications.class);
        startActivity(adminIntent);

        Intent logoutIntent = new Intent(Student_registation.this, MainActivity.class);
        startActivity(logoutIntent);
    }

}