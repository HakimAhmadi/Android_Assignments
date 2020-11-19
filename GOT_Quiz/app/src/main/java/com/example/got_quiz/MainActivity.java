package com.example.got_quiz;

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
        Button startbtn = findViewById(R.id.Startbtn);
        Button infobtn = findViewById(R.id.Infobtn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfo();
            }
        });

    }

    public void startGame(){
        Intent intent = new Intent(this, QuizBody.class);
        startActivity(intent);
    }
    public void startInfo(){
        Intent intent2= new Intent(this, InfoPage.class);
        startActivity(intent2);
    }
}