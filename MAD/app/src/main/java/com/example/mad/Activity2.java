package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final EditText integer = findViewById(R.id.Integer);
        final Button btn_int = findViewById(R.id.Btn_integer);
        final TextView activity3 = findViewById(R.id.TextView_Interger);

        btn_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.valueOf(integer.getText().toString());
                int zero=0;

                String result = "";
                if (zero<=value){
                    for (int i = 1;i<=value;i++) {
                        result += " " + i * i + " ";
                        zero=i*i;}
                }
                activity3.setText(result);}
                });
    }}