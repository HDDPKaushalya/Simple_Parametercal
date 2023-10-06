package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    Button b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        e1 = findViewById(R.id.E1);
        e2 = findViewById(R.id.E2);
        t1 = findViewById(R.id.A2);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n0  = Integer.parseInt(e1.getText().toString());
                int n1  =Integer.parseInt(e2.getText().toString());
                int ans =2*(n0+n1);
                t1.setText(": "+ans);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(g);

            }
        });

    }
}