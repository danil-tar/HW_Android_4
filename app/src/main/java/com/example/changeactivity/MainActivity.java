package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("TEST", "MainActivity onCreate");

        View buttonGoToSecondActivity = findViewById(R.id.button_go_to_second_activity);
        buttonGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST", "MainActivity onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST", "MainActivity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST", "MainActivity onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST", "MainActivity onStop");
    }


}