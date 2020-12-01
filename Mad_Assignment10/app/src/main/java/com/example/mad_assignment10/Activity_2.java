package com.example.mad_assignment10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ImageButton imageButton = findViewById(R.id.Carbtn);
        TextView textView = findViewById(R.id.Carname);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity_2.this, Activity2_body.class);
                String carn=textView.getText().toString().toLowerCase().trim();
                intent.putExtra("carname",carn);
                startActivity(intent);

            }
        });

    }

}