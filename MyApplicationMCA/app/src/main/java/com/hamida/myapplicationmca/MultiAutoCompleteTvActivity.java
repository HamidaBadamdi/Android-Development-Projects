package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MultiAutoCompleteTvActivity extends AppCompatActivity {

    MultiAutoCompleteTextView multiAutoCompleteTextView;
    Button btnSubmit;
    TextView tvResult;

    // Data source
    String[] languages = {
            "Java", "Python", "C", "C++", "Kotlin",
            "Swift", "JavaScript", "PHP", "Go", "Ruby"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_multi_auto_complete_tv);

        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                languages
        );


        multiAutoCompleteTextView.setAdapter(adapter);


        multiAutoCompleteTextView.setThreshold(1);


        multiAutoCompleteTextView.setTokenizer(
                new MultiAutoCompleteTextView.CommaTokenizer()
        );


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedItems = multiAutoCompleteTextView.getText().toString();
                tvResult.setText("Selected: " + selectedItems);
            }
        });


    }
}