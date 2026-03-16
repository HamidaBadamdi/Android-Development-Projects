package com.hamida.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SyllabusActivity extends AppCompatActivity {

    LinearLayout unit1Layout, unit2Layout, unit3Layout, unit4Layout, unit5Layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        unit1Layout = findViewById(R.id.unit1Layout);
        unit2Layout = findViewById(R.id.unit2Layout);
        unit3Layout = findViewById(R.id.unit3Layout);
        unit4Layout = findViewById(R.id.unit4Layout);
        unit5Layout = findViewById(R.id.unit5Layout);

        unit1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyllabusActivity.this , Unit1Activity.class);
                startActivity(intent);
            }
        });


        unit2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyllabusActivity.this , Unit2Activity.class);
                startActivity(intent);
            }
        });

        unit3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyllabusActivity.this , Unit3Activity.class);
                startActivity(intent);
            }
        });

        unit4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyllabusActivity.this , Unit3Activity.class);
                startActivity(intent);
            }
        });

        unit5Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SyllabusActivity.this , Unit5Activity.class);
                startActivity(intent);
            }
        });



    }



}