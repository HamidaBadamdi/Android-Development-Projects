/*
Program Name: RadioGroup Selection Activity

Description:
This Android program demonstrates how to use multiple RadioGroups
to select options such as education and programming language.

Features:
- Two RadioGroups (Education & Language)
- User selects one option from each group
- Button click displays selected values
- Validation using Toast if no option is selected

Author: Hamida Badamdi
*/
package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioGroupActivity extends AppCompatActivity {

    RadioGroup rgLanguage, rgEducation;
    Button btnShow;
    TextView tvEdu, tvLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        rgLanguage = findViewById(R.id.rgLangugae);
        rgEducation = findViewById(R.id.rgEdu);
        btnShow = findViewById(R.id.btnShow);
        tvEdu = findViewById(R.id.tvEdu);
        tvLanguage = findViewById(R.id.tvLanguage);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedEduID = rgEducation.getCheckedRadioButtonId();
                int selectedLngID = rgLanguage.getCheckedRadioButtonId();


                if (selectedLngID == -1 || selectedEduID == -1) {
                    Toast.makeText(RadioGroupActivity.this, "Please select an option!", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton selectedEdu = findViewById(selectedEduID);
                String value1 = selectedEdu.getText().toString();
                tvEdu.setText("Selected Education: " + value1);

                RadioButton selectedLang = findViewById(selectedLngID);
                String value2 = selectedLang.getText().toString();
                tvLanguage.setText("Selected Language: " + value2);

            }
        });

    }
}