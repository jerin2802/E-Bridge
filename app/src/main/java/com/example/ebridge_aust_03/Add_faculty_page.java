package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Add_faculty_page extends AppCompatActivity implements View.OnClickListener{

    Button addquepaper,back,msg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty_page);

        Toast.makeText(Add_faculty_page.this,"Login Successful", Toast.LENGTH_SHORT).show();
        addquepaper = (Button) findViewById(R.id.addquepaperButton);
        addquepaper.setOnClickListener(this);

        msg = (Button) findViewById(R.id.notificationButton);
        msg.setOnClickListener(this);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);

    }
    public void onClick(View view) {
        Intent addquestionsIntent = new Intent(Add_faculty_page.this, Add_question_paper.class);
        startActivity(addquestionsIntent);

        Intent msgIntent = new Intent(Add_faculty_page.this, Notifications.class);
        startActivity(msgIntent);

        Intent logoutIntent = new Intent(Add_faculty_page.this, View_Admin_Added_Faculty.class);
        startActivity(logoutIntent);
    }
}