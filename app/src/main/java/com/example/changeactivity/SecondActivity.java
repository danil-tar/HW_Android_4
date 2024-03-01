package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("TEST", "SecondActivity onCreate");

        View buttonToExit = findViewById(R.id.exit_button);
        buttonToExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST", "SecondActivity onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST", "SecondActivity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST", "SecondActivity onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST", "SecondActivity onStop");
    }

}