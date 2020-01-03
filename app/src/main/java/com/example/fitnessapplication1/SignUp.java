package com.example.fitnessapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    
    private Button Move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        Button signUpBtn = (Button) findViewById(R.id.btnSignUp);

        signUpBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, UserData.class));
            }
        });


    }
}

