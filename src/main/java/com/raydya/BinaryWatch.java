package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 60; y++) {
                // x - hours, y - minutes
                if (Integer.bitCount(x) + Integer.bitCount(y) == num) {
                    // - they must be equal to the number of LEDS given as an argument, so if this passes,
                    //     proceed with making the string for this hour:minute combination.
                    final String sb = x +
                        ":" +
                        ((y < 10) ? "0" : "") + y;
                    times.add(sb);
                }
            }
        }
        return times;
    }
}
