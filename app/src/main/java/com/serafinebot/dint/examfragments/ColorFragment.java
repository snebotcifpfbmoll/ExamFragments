package com.serafinebot.dint.examfragments;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

public class ColorFragment extends Fragment {
    private static final String TAG = "ColorFragment";

    public FragmentDelegate delegate = null;
    private SeekBar redBar = null;
    private SeekBar greenBar = null;
    private SeekBar blueBar = null;
    private Button colorButton = null;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color, container, false);

        redBar = view.findViewById(R.id.redSlider);
        greenBar = view.findViewById(R.id.greenSlider);
        blueBar = view.findViewById(R.id.blueSlider);
        colorButton = view.findViewById(R.id.changeColorButton);

        colorButton.setOnClickListener(v -> {
            int red = redBar.getProgress();
            int green = greenBar.getProgress();
            int blue = blueBar.getProgress();
            if (delegate != null) delegate.didChangeColor(Color.valueOf(red, green, blue));
        });

        return view;
    }
}