package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class traingle extends AppCompatActivity {

    EditText e1,e2,e3;
    TextView t1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traingle);
        e1 = findViewById(R.id.Ear1);
        e2 = findViewById(R.id.Ear2);
        e3 = findViewById(R.id.Ear3);
        t1 = findViewById(R.id.Aan);
        b1 = findViewById(R.id.poa1);
        b2 = findViewById(R.id.poa2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n0  = Integer.parseInt(e1.getText().toString());
                int  n1  = Integer.parseInt(e2.getText().toString());
                int  n2  = Integer.parseInt(e3.getText().toString());
                int ans = n0+n1+n2;
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
