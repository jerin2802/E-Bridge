package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button studentButton;
    Button facultyButton;
    Button  adminButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentButton = (Button) findViewById(R.id.studentButton);
        studentButton.setOnClickListener(this);

        facultyButton = (Button) findViewById(R.id.facultyButton);
        facultyButton.setOnClickListener(this);

        adminButton = (Button) findViewById(R.id.adminButton);
        adminButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent adminIntent = new Intent(MainActivity.this,Login .class);
        startActivity(adminIntent);

        Intent facultyIntent = new Intent(MainActivity.this, Teacher_login.class);
        startActivity(facultyIntent);

        Intent studentIntent = new Intent(MainActivity.this, Student_login.class);
        startActivity(studentIntent);
    }


}