package com.example.activityno5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText value = findViewById(R.id.MainActivityText);
        Button Main_button_result = findViewById(R.id.MainActivityButtonResult);
        Button Main_button_next = findViewById(R.id.MainActivityButtonNext2);
        final TextView textView = findViewById(R.id.MainActivityTextView);

        Main_button_result.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int limit = Integer.parseInt(value.getText().toString());
                int result=0;
                int first = 0;
                int second = 1;

                ArrayList<Integer> answers = new ArrayList<Integer>();
                StringBuilder stranswers = new StringBuilder();

                if (limit >=0){
                    answers.add(0);}
                if (limit >=1){
                    answers.add(1);}
                if (limit >=2){
                    while (result <= limit) {
                        result = first + second;

                        first=second;
                        second=result;

                        answers.add(result);
                    }
                    answers.remove(answers.size()-1);
                }

                for (int i : answers) {
                    stranswers.append(String.valueOf(i)).append("\n");
                }
                textView.setMovementMethod(new ScrollingMovementMethod());
                textView.setText(stranswers.toString());

            }
        });

        Main_button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activatingTwo();}
        });

        }
        private void activatingTwo(){
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
        }

    }