package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {

    public List<Integer> findPeaks(int[] mountain) {
        final List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            final int pre = mountain[i - 1];
            final int candidate = mountain[i];
            final int after = mountain[i + 1];
            if (candidate > pre && candidate > after) {
                peaks.add(i);
            }
        }

        return peaks;
    }

}
