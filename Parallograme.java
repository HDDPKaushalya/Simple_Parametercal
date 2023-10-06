package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class Parallograme extends AppCompatActivity {
     Button B0,B21;
     TextView Anser;
     EditText e5,e6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallograme);
        B0= findViewById(R.id.po);
        B21 = findViewById(R.id.po1);
        e5 = findViewById(R.id.Ed1);
        e6 = findViewById(R.id.Ed2);
        Anser = findViewById(R.id.An34);

        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n0  = Integer.parseInt(e5.getText().toString());
                int n1  = Integer.parseInt(e6.getText().toString());
                int ani = 2*(n0+n1);
               Anser.setText(": "+ani);


            }
        });
        B21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });



    }
}