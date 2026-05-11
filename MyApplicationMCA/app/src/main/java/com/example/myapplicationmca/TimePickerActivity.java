package com.hamida.myapplicationmca;

import android.app.TimePickerDialog;
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

public class TimePickerActivity extends AppCompatActivity {

    Button btnPickTime;
    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_time_picker);

        btnPickTime = findViewById(R.id.btnPickTime);
        tvTime = findViewById(R.id.tvTime);

        btnPickTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);


                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        TimePickerActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(android.widget.TimePicker view,
                                                  int selectedHour, int selectedMinute) {

                                String time = selectedHour + ":" + selectedMinute;
                                tvTime.setText("Selected Time: " + time);
                            }
                        },
                        hour,
                        minute,
                        true // true = 24-hour format
                );

                timePickerDialog.show();
            }
        });

    }
}