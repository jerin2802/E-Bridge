package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Teacher_login extends AppCompatActivity implements View.OnClickListener {

    Button login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_teacher_login);

        login = (Button) findViewById(R.id.loginbtn);
        login.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent loginIntent = new Intent(Teacher_login.this, Add_faculty_page.class);
        startActivity(loginIntent);

    }
}