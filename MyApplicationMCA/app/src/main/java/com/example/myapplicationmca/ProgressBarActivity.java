package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Button btnStart;
    TextView tvProgress;

    int progressStatus = 0;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_progress_bar);

        progressBar = findViewById(R.id.progressBar);
        btnStart = findViewById(R.id.btnStart);
        tvProgress = findViewById(R.id.tvProgress);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressStatus = 0;

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus < 100) {
                            progressStatus += 10;

                            try {
                                Thread.sleep(500); // simulate work
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressStatus);
                                    tvProgress.setText("Progress: " + progressStatus + "%");
                                }
                            });
                        }
                    }
                }).start();
            }
        });

    }
}