package com.example.got_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class End_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end__page);

        Button playAgain = findViewById(R.id.PlayAgainbtn);
        Button endGame = findViewById(R.id.EndGamebtn);

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame();
            }
        });

        endGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainpage();
            }
        });
    }
    public void playGame(){
        Intent intent = new Intent(this, QuizBody.class);
        startActivity(intent);
    }
    public void mainpage(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}