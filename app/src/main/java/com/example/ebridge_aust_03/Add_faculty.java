package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add_faculty extends AppCompatActivity implements View.OnClickListener {

    Button addfaculty;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);

        addfaculty = (Button) findViewById(R.id.addfacultyButton);
        addfaculty.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent addIntent = new Intent(Add_faculty.this, View_Admin_Added_Faculty.class);
        startActivity(addIntent);
    }
}