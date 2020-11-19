package com.example.mad_assignment9_a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage_Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page__quiz);

        Button startbtn = findViewById(R.id.Startbtn);
        Button infobtn = findViewById(R.id.Infobtn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });

    }

    public void startGame(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}