package com.serafinebot.dint.examfragments;

import android.graphics.Color;

public interface FragmentDelegate {
    void didChangeText(String text, int size);
    void didChangeColor(Color color);
}
