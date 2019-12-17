package com.example.fitnessapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignIn extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 0;
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

        Login.setOnClickListener(new View.OnClickListener() {
            //set a listener onto my button
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
                //convert name to a string so it works inside the loop.
            }
        });
    }
    private void validate(String userName, String userPassword){
            //function to validate Name and password as the 2 parameters
        if((userName.equals("Admin")) && (userPassword.equals("5678"))){
            //only when username is "Admin" and password is "5678"
            Intent intent = new Intent(SignIn.this, MainScreen.class);
            startActivity(intent);
            //move onto next activity
        }else{
            counter++;
            //increment counter by 1
            Info.setText("Number of incorrect attempts: " + counter);
            if(counter == 3) {
                Login.setEnabled(false);
                //when counter reaches 3 disable the button.
            }
        }
    }
}
