/*
Program Name: SharedPreferences Example in Android

Description:
This Android activity demonstrates how to use SharedPreferences
to store and retrieve simple key-value data locally on the device.

SharedPreferences is commonly used for saving small amounts of data
such as user settings, login details, or preferences.

Concepts Used:
• SharedPreferences (Local Storage)
• Key-Value Pair Storage
• Android UI Components (EditText, Button, TextView)
• Event Handling (OnClickListener)

Features:
- Persistent storage (data remains even after app restart)
- Simple and lightweight storage mechanism

Note:
- Data is stored in private mode (accessible only to this app)

Author: Hamida Badamdi
*/


package com.hamida.myapplicationmca;

import android.content.SharedPreferences;
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

public class SharedPreferenceActivity extends AppCompatActivity {

    EditText edtUsername;
    Button btnSave, btnLoad;
    TextView tvResult;

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        edtUsername = findViewById(R.id.edtUsername);
        btnSave = findViewById(R.id.btnSave);
        btnLoad = findViewById(R.id.btnLoad);
        tvResult = findViewById(R.id.tvResult);

        sp = getSharedPreferences("MyApp" , MODE_PRIVATE);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name =  edtUsername.getText().toString().trim();

                if(!name.isEmpty()) {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("username", name);
                    editor.apply();

                    tvResult.setText("Saved!");
                    edtUsername.setText("");
                }
            }
        });

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saved_data = sp.getString("username" , "No Data available!");
                tvResult.setText(saved_data);

            }
        });

    }
}