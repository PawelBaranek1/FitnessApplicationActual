package com.example.fitnessapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

Toast.makeText(MainActivity.this,"Firebase Connection Success",Toast.LENGTH_LONG).show();
        //This will show a toast if firebase is connected to my application succsefully.
        //I will delete this as soon as I start coding the program, it is just to ensure that firebase is connected.
    }
}
