package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        b1 = findViewById(R.id.B01);
        b2 = findViewById(R.id.B02);
        e1 = findViewById(R.id.Edi1);
        ans = findViewById(R.id.Answ);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n0  = Double.parseDouble(e1.getText().toString());
                double an1 = 2*(3.14*n0);
                int an = (int) an1;
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
