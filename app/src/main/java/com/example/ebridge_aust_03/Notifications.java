package com.example.ebridge_aust_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Notifications extends AppCompatActivity implements View.OnClickListener {

    Button back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent logoutIntent = new Intent(Notifications.this, MainActivity.class);
        startActivity(logoutIntent);

    }
}