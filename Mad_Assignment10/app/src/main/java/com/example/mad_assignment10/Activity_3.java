package com.example.mad_assignment10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView textView = findViewById(R.id.A3_tv);
        Button button = findViewById(R.id.A3_btn);
        EditText palindromeValue = findViewById(R.id.PalindromeValue);
        EditText lexicographic = findViewById(R.id.LexicographicValue);

        class thread1 extends Thread {
            public void run(){
                String pal = palindromeValue.getText().toString();
                if (pal.equals(new StringBuilder(pal).reverse().toString())){
                    textView.setText("The entered value is Palindrome");
                }
                else{
                    textView.setText("The entered value is not Palindrome");
                }
            }
        }

        class thread2 extends Thread {
            public void run(){
                String[] pal = lexicographic.getText().toString().split(" ",0);
                boolean lexi = true;
                for (int i=0;i<pal.length-1;i++){
                    if (pal[i].charAt(0) >pal[i+1].charAt(0)){
                        lexi=false;
                    }
                }

                if (lexi){
                    textView.setText("The entered String is lexicographic");
                }
                else{
                    textView.setText("The entered String is not lexicographic");
                }

            }
        }

        button.setOnClickListener(v -> {
            thread1 forpal=new thread1();
            thread2 forlexi=new thread2();
            forpal.start();
            forlexi.start();
            try{
                forpal.run();
                forlexi.run();
            }catch (Exception e){
                textView.setText(e.toString());
            }
        });

    }
}