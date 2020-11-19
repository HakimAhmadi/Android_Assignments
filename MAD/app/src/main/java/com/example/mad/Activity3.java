package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        final EditText value1 = findViewById(R.id.Exe3_val1);
        final EditText value2 = findViewById(R.id.Exe3_val2);
        Button enter = findViewById(R.id.Exe3_Enter);
        final TextView result = findViewById(R.id.Exe3_Result);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.valueOf(value1.getText().toString());
                int val2 = Integer.valueOf(value2.getText().toString());

                if (val1>val2) {
                    double quotient = val1 / val2;
                    double reminder = val1 % val2;

                    String res = "Quotient = " + quotient + "\nReminder = " + reminder;
                    result.setText(res);
                }
                else{
                    String res = "Make sure value 1 is greater ";
                    result.setText(res);
                }

            }
        });
    }
}