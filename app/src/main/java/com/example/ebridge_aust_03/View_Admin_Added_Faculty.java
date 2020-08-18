package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class View_Admin_Added_Faculty extends AppCompatActivity implements View.OnClickListener {

    Button addbutton,back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__admin__added__faculty);

        addbutton = (Button) findViewById(R.id.addButton);
        addbutton.setOnClickListener(this);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent adminaddedIntent = new Intent(View_Admin_Added_Faculty.this, Add_faculty_page.class);
        startActivity(adminaddedIntent);

        Intent logoutIntent = new Intent(View_Admin_Added_Faculty.this, MainActivity.class);
        startActivity(logoutIntent);
    }
}