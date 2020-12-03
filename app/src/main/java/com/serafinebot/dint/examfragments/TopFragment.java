package com.serafinebot.dint.examfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class TopFragment extends Fragment {
    private static final String TAG = "fragment_top";

    private EditText editText = null;
    private SeekBar seekBar = null;
    private Button changeTextButton = null;
    public FragmentDelegate delegate = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        editText = view.findViewById(R.id.textInput);
        seekBar = view.findViewById(R.id.textSize);
        changeTextButton = view.findViewById(R.id.textButton);

        changeTextButton.setOnClickListener(v -> {
            int textSize = seekBar.getProgress();
            String text = String.valueOf(editText.getText());
            if (delegate != null) delegate.didChangeText(text, textSize);
        });

        return view;
    }
}