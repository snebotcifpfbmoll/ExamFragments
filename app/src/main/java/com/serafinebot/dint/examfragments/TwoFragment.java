package com.serafinebot.dint.examfragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TwoFragment extends Fragment {
    private static final String TAG = "TwoFragment";
    private TextView textView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        textView = view.findViewById(R.id.textView);

        return view;
    }

    public void updateText(String text, int size) {
        Log.d(TAG, "updateText: " + text + size);
        if (textView != null) {
            textView.setText(text);
            textView.setTextSize(size);
        }
    }

    public void updateColor(int color) {
        textView.setTextColor(color);
    }
}