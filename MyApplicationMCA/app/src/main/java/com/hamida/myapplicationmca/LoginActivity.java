package com.hamida.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsr, edtPass;
    Button btnLoggin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsr = findViewById(R.id.edtUsr);
        edtPass = findViewById(R.id.edtPass);
        btnLoggin = findViewById(R.id.btnLoggin);

        btnLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUsr.getText().toString().trim();
                String pass = edtPass.getText().toString().trim();

                if (username.equals("Ruhi") && pass.equals("123")) {
                    Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                    intent.putExtra("usrname", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }


}