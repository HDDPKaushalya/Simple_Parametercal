package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapezoid extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    TextView t1;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);
        e1 = findViewById(R.id.Er1);
        e2 = findViewById(R.id.Er2);
        e3 = findViewById(R.id.Err3);
        e4 = findViewById(R.id.Err4);
        t1 = findViewById(R.id.Aa);
        b1 = findViewById(R.id.po23);
        b2 = findViewById(R.id.po12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  n0  = Integer.parseInt(e1.getText().toString());
                int n1  = Integer.parseInt(e2.getText().toString());
                int n2  = Integer.parseInt(e3.getText().toString());
                int n3  = Integer.parseInt(e4.getText().toString());
                int ans = n0+n1+n2+n3;
                t1.setText(": "+ans);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oi = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(oi);

            }
        });


    }
}