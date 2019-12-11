package com.example.fitnessapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    //This creates an instance of the firebase authenticator so I can then use it in my application
    private EditText userName, userPassword, userEmail;
    //This declares the textviews inside the SignUp activity
    private Button signUpButton;
    //This declares the button inside the SignUp activity
    private TextView signIn;
    //This declares the textview inside the SignUp activity



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        setupUIViews();

        signUpButton.setOnClickListener(new View.OnClickListener() {
            //the OnClickListener is now set
            @Override
            public void onClick(View view) {
                if(validate()){
                    //Upload to database
                }

            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this, MainActivity.class));
            }
        });
    }


    private void setupUIViews(){
        //using function to assign the above variables to their ids.
        userName = (EditText)findViewById(R.id.etName);
        userPassword = (EditText)findViewById(R.id.etPassword);
        userEmail = (EditText)findViewById(R.id.etEmail);
        //All of my textviews are now defined
        signUpButton = (Button)findViewById(R.id.btnSignUp);
        //My button has now also been declared
        signIn = (TextView) findViewById(R.id.tvUserLogIn);
        //Now all my variables have been assigned to their corresponding xml IDs
    }

    private Boolean validate(){
    //If true then allow access else deny
        Boolean result = false;
        //Result will be the variable that will be true/false
        String name = userName.getText().toString();
        String password = userPassword.getText().toString();
        String email = userEmail.getText().toString();
        //Created variables which I will be testing for
        if(name.isEmpty() && password.isEmpty()  && email.isEmpty()) {
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
            //displays an error toast if fields are empty
        }else{
            result = true;
        }
        return result;
    }
}
