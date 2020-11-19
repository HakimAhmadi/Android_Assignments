package com.example.mad;

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

        final Button activity1 = findViewById(R.id.activity1);
        final Button activity2 = findViewById(R.id.activity2);
        final Button activity3 = findViewById(R.id.activity3);

        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callactivity1();}
        });

        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callactivity2();
            }
        });

        activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callactivity3();
            }
        });
    }
    public void callactivity1(){
            Intent intent= new Intent(this, Activity1.class);
            startActivity(intent);
        }
    public void callactivity2(){
        Intent intent= new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void callactivity3(){
        Intent intent= new Intent(this, Activity3.class);
        startActivity(intent);
    }

     }


















