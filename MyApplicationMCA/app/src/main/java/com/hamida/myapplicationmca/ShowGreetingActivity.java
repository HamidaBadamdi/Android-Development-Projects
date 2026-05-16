package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowGreetingActivity extends AppCompatActivity {


    EditText edtName;
    Button btnSubmit;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_greeting);
        edtName = findViewById(R.id.edtName);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= edtName.getText().toString().trim();

                if(name.isEmpty())
                {
                    tvResult.setText("Please eneter your name!");
                }
                else
                {
                    tvResult.setText("Hello, " + name + " \uD83D\uDC4B ");
                }

            }
        });


    }
}