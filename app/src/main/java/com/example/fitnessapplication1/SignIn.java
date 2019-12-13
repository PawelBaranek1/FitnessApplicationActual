package com.example.fitnessapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignIn extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    //Created variables for my objects

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Name = (EditText) findViewById(R.id.etEmail);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvUserLogIn);
        Login = (Button) findViewById(R.id.btnLogin);
        //Assigned created variables to their IDs
    }
    private void Validate(String userName, String userPassword){
            //function to validate Name and password as the 2 parameters
        if((userName == "Admin") && (userPassword == "5678")){
            Intent intent = new Intent(SignIn.this, MainScreen.class);


        }
    }
}
