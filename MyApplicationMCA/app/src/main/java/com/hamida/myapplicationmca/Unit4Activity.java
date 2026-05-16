package com.hamida.myapplicationmca;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Unit4Activity extends AppCompatActivity {

    LinearLayout layout1,layout2,layout3,layout4,layout5 , layout7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_unit4);

        layout3 = findViewById(R.id.layout3);
        layout7 = findViewById(R.id.layout7);

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit4Activity.this , SharedPreferenceActivity.class);
                startActivity(intent);
            }
        });

        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Unit4Activity.this , VideoViewActivity.class);
                startActivity(intent);
            }
        });
    }
}