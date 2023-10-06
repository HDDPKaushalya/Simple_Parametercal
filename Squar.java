package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Squar extends AppCompatActivity {
Button b1,b2;
EditText e1;
TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squar);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        e1 = findViewById(R.id.Edit1);
        ans = findViewById(R.id.Answer);



         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int n0  = Integer.parseInt(e1.getText().toString());
                 int  an = 4*n0;
                 ans.setText(": "+an);

             }
          });
           b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i = new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(i);

             }
         });

    }
}