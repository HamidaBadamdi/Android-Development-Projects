package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserInfoActivity extends AppCompatActivity {

    TextView txtUsr,txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_info);
        txtUsr=findViewById(R.id.txtUsr);
        txtPass=findViewById(R.id.txtPass);

        String username = getIntent().getStringExtra("usrname");
        String pwd = getIntent().getStringExtra("pass");

        txtUsr.setText("Username : " + username);
        txtPass.setText("Password : " + pwd);

    }
}