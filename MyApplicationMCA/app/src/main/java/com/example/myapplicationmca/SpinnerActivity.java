/*
Program Name: Spinner Selection Activity

Description:
This Android program demonstrates how to use a Spinner
to select an option from a dropdown list.

Features:
- Displays list of countries using Spinner
- Shows selected item in TextView
- Displays Toast message on selection
- Uses ArrayAdapter for data binding

Author: Hamida Badamdi
*/

package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    TextView tvSelected;
    String[] countries = {"------ Select Country ------","India" , "Australia" , "New Zealand" , "USA" , "Germany" , "Canada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);
        tvSelected = findViewById(R.id.tvSelected);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0)
                {
                    tvSelected.setText("Please select a country!");
                    return;
                }

                String selected = countries[i];
                tvSelected.setText("Selected: " + selected);
                Toast.makeText(SpinnerActivity.this, selected, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                tvSelected.setText("Nothing Selected!");
            }
        });

    }
}