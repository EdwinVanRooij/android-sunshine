package com.example.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: created");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: stopped");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: resumed");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: started");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: destroyed");
    }
}
