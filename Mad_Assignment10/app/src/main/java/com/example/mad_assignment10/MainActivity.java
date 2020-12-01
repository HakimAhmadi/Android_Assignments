package com.example.mad_assignment10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView activity1= findViewById(R.id.activity1);
        ImageView activity2= findViewById(R.id.activity2);
        ImageView activity3= findViewById(R.id.activity3);

        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity1();

            }
        });
        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity2();

            }
        });
        activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity3();

            }
        });
    }
    void startActivity1(){
        Intent intent = new Intent(this, Activity_1.class);
        startActivity(intent);
    }
    void startActivity2(){
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);
    }
    void startActivity3(){
        Intent intent = new Intent(this, Activity_3.class);
        startActivity(intent);
    }
}