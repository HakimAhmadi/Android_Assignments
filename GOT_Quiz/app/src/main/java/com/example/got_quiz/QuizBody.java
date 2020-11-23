package com.example.got_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizBody extends AppCompatActivity {


    String[] options;

    public int state=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_body);
        statusCheck(state);
        RadioGroup radioGroup = findViewById(R.id.Answers);
        Button submitbtn = findViewById(R.id.Submitbtn);



        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ansindex= radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(ansindex);
                String answer= (String) radioButton.getText();
                if (answer.equals(options[5])){
                    Toast.makeText(QuizBody.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    state+=1;
                    statusCheck(state);
                    radioGroup.clearCheck();
                }
                else{
                    Toast.makeText(QuizBody.this, "Wronge Answer", Toast.LENGTH_SHORT).show();
                    statusCheck(state);
                }
            }
        });

    }
    public void statusCheck(int state){
        switch (state){
            case 0:
                options=question1();
                break;
            case 1:
                options=question2();
                break;
            case 2:
                options=question3();
                break;
            case 3:
                options=question4();
                break;
            case 4:
                options=question5();
                break;
            case 5:
                options=question6();
                break;
            case 6:
                CompleteQuiz();
                break;
        }
        TextView questionTv= findViewById(R.id.QuestionBox);
        questionTv.setText(options[0]);
        RadioButton answer1 = findViewById(R.id.Answer1);
        answer1.setText(options[1]);
        RadioButton answer2 = findViewById(R.id.Answer2);
        answer2.setText(options[2]);
        RadioButton answer3 = findViewById(R.id.Answer3);
        answer3.setText(options[3]);
        RadioButton answer4 = findViewById(R.id.Answer4);
        answer4.setText(options[4]);

    };

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
    private String[] question4(){
        return new String[]{"Arya's punishment for stealing from the Many-Face God is: ","Death","Memory Loss","Blindness","Uncontrollable laughter","Blindness" };
    }
    private String[] question5(){
        return new String[]{"What was the name of Ned Stark's greatsword?","Ice","Oathkeeper","Widow's Wail","Northguard","Ice" };
    }
    private String[] question6(){
        return new String[]{"Which Stark family direwolf was killed in retaliation for an attack on Prince Joffrey?","Ghost","Lady","Nymeria","Summer","Lady" };
    }
    private String[] question(){
        return new String[]{"","","","","","" };
    }
    
    private void CompleteQuiz(){
        Intent intent = new Intent(this,End_Page.class);
        startActivity(intent);
    }
}
