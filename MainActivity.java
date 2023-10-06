package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton Img1,Img2,Img3,Img4,Img5,Img6,Img7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set the Path
         Img1 = findViewById(R.id.imageButton1);
         Img2 = findViewById(R.id.imageButton2);
         Img3 = findViewById(R.id.imageButton3);
         Img4 = findViewById(R.id.imageButton4);
         Img5 = findViewById(R.id.imageButton5);
         Img6 = findViewById(R.id.imageButton6);
         Img7 = findViewById(R.id.imageButton7);


         Img1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i1 = new Intent(getApplicationContext(), Squar.class);
                 startActivity(i1);

             }

         });
         Img2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i2 = new Intent(getApplicationContext(), Parallograme.class);
                 startActivity(i2);

             }
         });
         Img3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i3 = new Intent(getApplicationContext(), Rectangle.class);
                 startActivity(i3);
             }
         });
         Img4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i4 = new Intent(getApplicationContext(), Rhombus.class);
                 startActivity(i4);
             }
         });
         Img5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i5 = new Intent(getApplicationContext(), Trapezoid.class);
                 startActivity(i5);
             }
         });
         Img6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i6 = new Intent(getApplicationContext(), traingle.class);
                 startActivity(i6);

             }
         });
         Img7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i7 = new Intent(getApplicationContext(), Circle.class);
                 startActivity(i7);

             }
         });



    }
}