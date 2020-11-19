package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.Msg_TV);
        Button update_button = findViewById(R.id.Update_Button);
        Button delete_button = findViewById(R.id.Delete_button);


        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Date date= new Date();

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference( "Entry");

                myRef.setValue(date.toString());
                textView.setText(date.toString());


            }
        });
        // Read from the database



        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();

                DatabaseReference path = database.getReference("Entry");
                path.removeValue();

                textView.setText("");

            }
        });
    }
}