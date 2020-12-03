package com.serafinebot.dint.examfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentDelegate {
    private static final String TAG = "MainActivity";

    private TopFragment topFragment = null;
    private TwoFragment twoFragment = null;
    private ColorFragment colorFragment = null;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topFragment = (TopFragment) getSupportFragmentManager().findFragmentById(R.id.topFragment);
        topFragment.delegate = this;

        twoFragment = (TwoFragment) getSupportFragmentManager().findFragmentById(R.id.twoFragment);
        colorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.colorFragment);
        colorFragment.delegate = this;
    }

    @Override
    public void didChangeText(String text, int size) {
        Log.d(TAG, "didChangeText: " + text + size);
        if (twoFragment != null) twoFragment.updateText(text, size);
    }

    @Override
    public void didChangeColor(Color color) {
        if (twoFragment != null) twoFragment.updateColor(color);
    }
}