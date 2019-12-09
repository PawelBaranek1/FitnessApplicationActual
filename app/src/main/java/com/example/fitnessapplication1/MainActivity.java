package com.example.fitnessapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText emailId, password;
    Button btnSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signInBtn = (Button) findViewById(R.id.sign_in_button1);

        signInBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SignIn.class));
            }
        });
//This piece of code means that when the user clicks on the button it will take them to the
//next activity where the sign in screen will be.


        Button signUpBtn = (Button) findViewById(R.id.sign_up_button1);

        signUpBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SignUp.class));
            }
        });
//This section of code also does the same but for the sign up button


    }



}



