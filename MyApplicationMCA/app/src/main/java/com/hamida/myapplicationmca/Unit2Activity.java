package com.hamida.myapplicationmca;

import android.content.Intent;
import android.net.LinkAddress;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Unit2Activity extends AppCompatActivity {

    LinearLayout layout1,layout2,layout3,layout4,layout5,layout6,layout7,layout8,
    layout9,layout10,layout11,layout12,layout13,layout14,layout15,layout16,layout17,
    layout18,layout19, layout20, layout21, layout22, layout23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_unit2);

        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
        layout5 = findViewById(R.id.layout5);
        layout6 = findViewById(R.id.layout6);
        layout7 = findViewById(R.id.layout7);
        layout8 = findViewById(R.id.layout8);
        layout9 = findViewById(R.id.layout9);
        layout10 = findViewById(R.id.layout10);
        layout11= findViewById(R.id.layout11);
        layout12= findViewById(R.id.layout12);
        layout13= findViewById(R.id.layout13);
        layout14= findViewById(R.id.layout14);
        layout15= findViewById(R.id.layout15);
//        layout16= findViewById(R.id.layout16);
//        layout17= findViewById(R.id.layout17);
//        layout18= findViewById(R.id.layout18);
//        layout19= findViewById(R.id.layout19);
//        layout20= findViewById(R.id.layout20);
//        layout21= findViewById(R.id.layout21);
//        layout22= findViewById(R.id.layout22);
//        layout23= findViewById(R.id.layout23);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , LoginActivity.class);
                startActivity(intent);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , LoginActivity.class);
                startActivity(intent);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , CallActivity.class);
                startActivity(intent);
            }
        });

        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , CallActivity.class);
                startActivity(intent);
            }
        });

        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , CallActivity.class);
                startActivity(intent);
            }
        });

        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , CallActivity.class);
                startActivity(intent);
            }
        });

        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , CallActivity.class);
                startActivity(intent);
            }
        });

        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , ListViewActivity.class);
                startActivity(intent);
            }
        });

        layout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , SpinnerActivity.class);
                startActivity(intent);
            }
        });

        layout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , CheckBoxActivity.class);
                startActivity(intent);
            }
        });


        layout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        layout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , RadioGroupActivity.class);
                startActivity(intent);
            }
        });

        layout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , ImageViewActivity.class);
                startActivity(intent);

            }
        });

        layout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit2Activity.this , ShowGreetingActivity.class);
                startActivity(intent);
            }
        });

    }
}