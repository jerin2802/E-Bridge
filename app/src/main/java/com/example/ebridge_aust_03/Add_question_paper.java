package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add_question_paper extends AppCompatActivity implements View.OnClickListener{

    Button submit,back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question_paper);

        submit = (Button) findViewById(R.id.questionsubmitButton);
        submit.setOnClickListener(this);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent submitIntent = new Intent(Add_question_paper.this, add_question_without_image.class);
        startActivity(submitIntent);

        Intent logoutIntent = new Intent(Add_question_paper.this, Add_faculty_page.class);
        startActivity(logoutIntent);
    }
}