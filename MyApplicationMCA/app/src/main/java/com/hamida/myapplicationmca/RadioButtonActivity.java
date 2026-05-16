/*
Program Name: RadioButton Selection Activity

Description:
This Android program demonstrates how to use RadioButtons
to allow the user to select one option.

Features:
- Two RadioButtons (Male, Female)
- Button click to submit selection
- Displays selected option in TextView
- Shows Toast message if no option is selected

Author: Hamida Badamdi

*/

package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioButtonActivity extends AppCompatActivity {


    RadioButton rdbMale,rdbFemale;
    Button  btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rdbMale = findViewById(R.id.rdbMale);
        rdbFemale = findViewById(R.id.rdbFemale);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(rdbMale.isChecked())
                {
                    tvResult.setText("Selected: " + rdbMale.getText().toString());
                }
                else if (rdbFemale.isChecked())
                {
                    tvResult.setText("Selected: " + rdbFemale.getText().toString());
                }
                else
                {
                    tvResult.setText("No option selected!");
                    Toast.makeText(RadioButtonActivity.this, "Please select an option!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}