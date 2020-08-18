package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class add_question_without_image extends AppCompatActivity implements View.OnClickListener{

    Button back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question_without_image);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent logoutIntent = new Intent(add_question_without_image.this, Add_question_paper.class);
        startActivity(logoutIntent);

    }

}