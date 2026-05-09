package com.hamida.myapplicationmca;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class DatePickerActivity extends AppCompatActivity {

    Button btnPickDate;
    TextView tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_date_picker);


        btnPickDate = findViewById(R.id.btnPickDate);
        tvDate = findViewById(R.id.tvDate);

        btnPickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        DatePickerActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(android.widget.DatePicker view,
                                                  int year, int month, int dayOfMonth) {


                                month = month + 1;

                                String selectedDate = dayOfMonth + "/" + month + "/" + year;
                                tvDate.setText("Selected Date: " + selectedDate);
                            }
                        },
                        year, month, day
                );

                datePickerDialog.show();
            }
        });


    }
}