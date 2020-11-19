package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText value1 = findViewById(R.id.Value1);
        final EditText value2 = findViewById(R.id.Value2);
        Button enter = findViewById(R.id.Enter);
        final TextView result = findViewById(R.id.Result);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1 = Integer.valueOf(value1.getText().toString());
                int val2 = Integer.valueOf(value2.getText().toString());

                if (val1 > val2){
                    String res= val1 + " is Greater than " + val2;
                    result.setText(res);}
                else if (val1 < val2){
                    String res = val1 +" is Smaller than " + val2;
                    result.setText(res);}
                else {
                    String res = val1 +" is equals to " +val2;
                    result.setText(res);}
            }
        });
    }
}