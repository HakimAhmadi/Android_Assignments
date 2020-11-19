package com.example.activityno5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText value = findViewById(R.id.Activity2Text);
        Button A2_button_result = findViewById(R.id.Activity2ButtonResult);
        Button A2_button_next = findViewById(R.id.Activity2ButtonNext3);
        final TextView textView = findViewById(R.id.Activity2TextView);

        A2_button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(value.getText().toString());

                String space=" ";
                StringBuilder result = new StringBuilder();

                for (int i=num;i>0;i--){
                    for (int k=i;k<num;k++){
                    result.append(space);}
                    for (int j=1;j<=i;j++){
                        result.append("*");
                    }
                    result.append("\n");
                }
                textView.setMovementMethod(new ScrollingMovementMethod());
                textView.setText(result.toString());

            }
        });

        A2_button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callActivity3();
            }
        });
    }

    private void callActivity3(){
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }
}