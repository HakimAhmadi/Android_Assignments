package com.example.inheritance_mad8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        final Button btn = findViewById(R.id.button);
        EditText value1 = findViewById(R.id.Value1);
        EditText value2 = findViewById(R.id.Value2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(value1.toString());
                int y = Integer.parseInt(value2.toString());

                Rectangle rectangle = new Rectangle(x,y);
                Square square = new Square(x,y);
                Circle circle = new Circle(x,y,4);

                String result="Rectangle (w="+x+",h="+y+")\nArea: "+rectangle.area()+"\nCircumference: "+rectangle.circumference()+
                        "\n\nSquare (w="+x+",h="+y+")\nArea: "+square.area()+"\nCircumference: "+square.circumference()+
                        "\n\nCircle (r=4) "+"\nArea: "+circle.area()+"\nCircumference: "+circle.circumference();
                textView.setText(result);
            }
        });
    }
}