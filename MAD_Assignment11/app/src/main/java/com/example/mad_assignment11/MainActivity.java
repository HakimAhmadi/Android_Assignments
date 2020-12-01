package com.example.mad_assignment11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activity1 = findViewById(R.id.Main_btn1);
        Button activity2 = findViewById(R.id.Main_btn2);

        activity1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Activity1.class);
            startActivity(intent);
        });
        activity2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
        });
    }
}