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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin = findViewById(R.id.A2_Signinbtn);
        Button signup = findViewById(R.id.A2_Signupbtn);
        EditText userid = findViewById(R.id.A2_SignInName);
        EditText userpass = findViewById(R.id.A2_SignInPass);

        FirebaseAuth user = FirebaseAuth.getInstance();

        signin.setOnClickListener(view -> {
            String email = userid.getText().toString();
            String password = userpass.getText().toString();

            user.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Toast.makeText(MainActivity.this, "Successfully Logged In", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(MainActivity.this, Activity1_TreeNode.class);
                                startActivity(intent);
                                finish();
                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                            }

                        }
                    });
        });

        signup.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity2_Signup.class);
            startActivity(intent);
        });
    }
}