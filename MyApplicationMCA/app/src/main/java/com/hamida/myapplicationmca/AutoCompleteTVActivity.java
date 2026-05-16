package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AutoCompleteTVActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    TextView tvResult;

    // Data source
    String[] countries = {
            "India", "USA", "UK", "Canada", "Australia",
            "Germany", "France", "Italy", "Japan", "China"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_auto_complete_tv);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        tvResult = findViewById(R.id.tvResult);

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                countries
        );

        // Set adapter
        autoCompleteTextView.setAdapter(adapter);

        // Start suggesting after 1 character
        autoCompleteTextView.setThreshold(1);

        // Item click listener
        autoCompleteTextView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String selected = parent.getItemAtPosition(position).toString();
                        tvResult.setText("Selected: " + selected);
                    }
                }
        );

    }
}