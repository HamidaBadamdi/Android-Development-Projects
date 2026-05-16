/*
Program Name: Call Dialer using Intent

Description:
This Android program demonstrates how to use Intent to open
the phone dialer with a user-entered phone number.

Features:
- User enters phone number in EditText
- On button click, dialer opens with the number
- Uses Intent.ACTION_DIAL for safe calling

Concepts Used:
- Intent
- URI (tel:)
- Event Handling (OnClickListener)

Author: Hamida Badamdi
*/

package com.hamida.myapplicationmca;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CallActivity extends AppCompatActivity {

    Button btnCall;
    EditText txtNumber;
    ImageButton btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_call);
        btnCall = findViewById(R.id.btnCall);
        txtNumber = findViewById(R.id.txtNumber);


        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber = txtNumber.getText().toString().trim();
                Uri number = Uri.parse("tel:" + phonenumber);

                Intent intent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(intent);

            }
        });

    }
}