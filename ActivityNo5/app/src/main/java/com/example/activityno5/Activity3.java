package com.example.activityno5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final EditText value1 = findViewById(R.id.Activity3Text1);
        final EditText value2 = findViewById(R.id.Activity3Text2);
        final EditText operator = findViewById(R.id.Activity3Text3);
        Button A3_button_result = findViewById(R.id.Activity3ResultButton);
        final TextView textView = findViewById(R.id.Activity3TextView);

        A3_button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(value1.getText().toString());
                int num2= Integer.parseInt(value2.getText().toString());
                String operatr = operator.getText().toString();
                int result=0;

                switch (operatr){
                    case "-":
                        result=num1-num2;
                        break;
                    case "+":
                        result=num1+num2;
                        break;
                    case "*":
                        result=num1*num2;
                        break;
                    case "/":
                        result=num1/num2;
                        break;
                }

                textView.setMovementMethod(new ScrollingMovementMethod());
                textView.setText(String.valueOf(result));

            }
        });
    }
}