package com.example.midtermexam;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_enter= findViewById(R.id.Enter_Button);
        EditText value_n = findViewById(R.id.Value_n);
        EditText value_m = findViewById(R.id.Value_m);
        TextView screen = findViewById(R.id.Result_View);

        b_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(value_n.getText().toString());
                int m=Integer.parseInt(value_m.getText().toString());

                StringBuilder answers=new StringBuilder();

//               column for calculation based on the number of M
                answers.append("N | ");
                for(int col=2;col<=m;col++){
                    answers.append(col);
                    answers.append(" ");
                }
                answers.append("\n");

//              For second #2 all "----"
                answers.append("--+");
                for (int tab=2;tab<=m;tab++){
                    answers.append("---");

                }
                answers.append("\n");


//              calculation rows based on the number of N
                for (int i=2;i<=n;i++){
                    answers.append(i).append(" | ");
                    for (int j=2;j<=m;j++){
                        int pow = (int)Math.pow(i,j);
                        answers.append(pow);
                        answers.append(" ");
                    }
                    answers.append("\n");
                }
                screen.setMovementMethod(new ScrollingMovementMethod());
                screen.setText(answers.toString());


            }
        });

    }
}