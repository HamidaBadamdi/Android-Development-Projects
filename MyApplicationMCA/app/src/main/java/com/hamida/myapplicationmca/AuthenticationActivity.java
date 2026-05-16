package com.hamida.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AuthenticationActivity extends AppCompatActivity {

    EditText edtUsr, edtPass;
    Button btnLoggin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_authentication);

        edtUsr = findViewById(R.id.edtUsr);
        edtPass = findViewById(R.id.edtPass);
        btnLoggin = findViewById(R.id.btnLoggin);


        btnLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = edtUsr.getText().toString().trim();
                String pass = edtPass.getText().toString().trim();

                if (username.equals("Ruhi") && pass.equals("123")) {
                    Intent intent = new Intent(AuthenticationActivity.this, UserInfoActivity.class);
                    intent.putExtra("usrname", username);
                    intent.putExtra("pass" , pass);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password!", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}