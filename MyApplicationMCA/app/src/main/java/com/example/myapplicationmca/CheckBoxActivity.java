package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox chkRead, chkMusic, chkTravel, chkGame;
    Button btnShow;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        chkRead = findViewById(R.id.chkRead);
        chkMusic = findViewById(R.id.chkMusic);
        chkTravel = findViewById(R.id.chkTravel);
        chkGame = findViewById(R.id.chkGame);
        btnShow = findViewById(R.id.btnShow);
        tvResult = findViewById(R.id.tvResult);


        btnShow.setOnClickListener(new View.OnClickListener() {
            String result = "Selected: ";

            @Override
            public void onClick(View view) {

                if (chkRead.isChecked()) {
                    result += chkRead.getText().toString() + ", ";
                }
                if (chkMusic.isChecked()) {
                    result += chkMusic.getText().toString() + ", ";
                }
                if (chkTravel.isChecked()) {
                    result += chkTravel.getText().toString() + ", ";
                }
                if (chkGame.isChecked()) {
                    result += chkGame.getText().toString();
                }

                if (result.equals("Selected: ")) {
                    result = "No option selected!";
                }
                tvResult.setText(result);
            }
        });

    }

}