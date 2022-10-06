package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "STARTING OPERATION");
        setContentView(R.layout.activity_main);
        Log.d(TAG, "FINISHED");
    }
}