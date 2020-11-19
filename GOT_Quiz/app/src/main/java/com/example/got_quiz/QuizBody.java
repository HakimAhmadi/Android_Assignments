package com.example.got_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizBody extends AppCompatActivity {


    String[] options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_body);

        RadioGroup radioGroup = findViewById(R.id.Answers);
        TextView questionTv= findViewById(R.id.QuestionBox);
        Button submitbtn = findViewById(R.id.Submitbtn);
        options=question1();
        boolean status =true;
        questionTv.setText(options[0]);
        RadioButton answer1 = findViewById(R.id.Answer1);
        answer1.setText(options[1]);
        RadioButton answer2 = findViewById(R.id.Answer2);
        answer2.setText(options[2]);
        RadioButton answer3 = findViewById(R.id.Answer3);
        answer3.setText(options[3]);
        RadioButton answer4 = findViewById(R.id.Answer4);
        answer4.setText(options[4]);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ansindex= radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(ansindex);
                String answer= (String) radioButton.getText();
                if (answer.equals(options[5])){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show();
                }

            }
        });



    }


    private String[] question1(){
        String[] q1={"Besides dragonglass, what is the only other substance capable of defeating White Walkers","Weirwood","Whildfire","Valyrian Steel","Snowballs","Valyrian Steel"};
        return q1;
    }
    private String[] question2(){
        String[] q2={"American Actor Peter Dinklage, who plays Tyrion Lannister, also had a starring role in this fantasy franchise: ","Lord of the Rings","Highlander", "The Chronicles of Narnia","The Lagend of Zeida","The Chronicles of Narnia"};
        return q2;
    }
    private String[] question3(){
        return new String[]{"How did Daenerys Targaryen eventually hatch her dragon eggs?","In a lightning storm","In a funeral pyre","In a fireplace","In a frozen cave","In a funeral pyre"};
    }

}
