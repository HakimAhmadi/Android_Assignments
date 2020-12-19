package com.example.mad_assignment11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Activity2_Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2__signup);

        Button signup = findViewById(R.id.A2_Reg_Signupbtn);
        EditText username = findViewById(R.id.A2_SignUpName);
        EditText userid = findViewById(R.id.A2_SignUpEmail);
        EditText userpass = findViewById(R.id.A2_SignUpPass);
        EditText userphone = findViewById(R.id.A2_SignUpPhone);

        FirebaseAuth user = FirebaseAuth.getInstance();

        signup.setOnClickListener(view -> {
            String email = userid.getText().toString();
            String password = userpass.getText().toString();


            user.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Toast.makeText(Activity2_Signup.this, "Successfully Logged In", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Activity2_Signup.this, Activity1_TreeNode.class);
                                startActivity(intent);
                                finish();
                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(Activity2_Signup.this, "Sign up Failed", Toast.LENGTH_LONG).show();
                            }

                        }
                    });
        });
    }
}