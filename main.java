package com.example.spinnerexample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        // Simulate a background task with a delay
        simulateBackgroundTask();
    }

    private void simulateBackgroundTask() {
        // Simulate a background task that takes some time
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Hide the spinner when the task is complete
                spinner.setVisibility(View.GONE);
            }
        }, 3000); // 3000 milliseconds (3 seconds) delay
    }
}
