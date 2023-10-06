package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rhombus extends AppCompatActivity {
EditText e1;
TextView T1;
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);
        e1 = findViewById(R.id.Ed1);
        T1 = findViewById(R.id.An);
        b1 = findViewById(R.id.po);
        b2 = findViewById(R.id.po1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  n0  = Integer.parseInt(e1.getText().toString());
                int ans = 4*n0;
                T1.setText(": "+ans);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(h);
            }
        });

    }
}