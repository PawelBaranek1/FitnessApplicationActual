package com.example.fitnessapplication1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

    private EditText Weight;
    private EditText Height;
    private EditText Sex;
    private Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Weight = (EditText) findViewById(R.id.etWeight);
        Height = (EditText) findViewById(R.id.etHeight);
        Sex = (EditText) findViewById(R.id.etSex);
        Submit =(Button) findViewById(R.id.btnSubmit);
        //Assigned variables to their IDs
        











    }




}
