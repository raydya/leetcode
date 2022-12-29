package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        final int[] h = new int[101];

        final List<Integer> r = new ArrayList<>();

        for (final int i : nums1) {
            h[i] = 1 | h[i];
        }

        for (final int i : nums2) {
            h[i] = 2 | h[i];
        }

        for (final int i : nums3) {
            h[i] = 4 | h[i];
        }

        for (int i = 0; i < h.length; i++) {
            if (h[i] == 3 || h[i] == 5 || h[i] == 6 || h[i] == 7) {
                r.add(i);
            }
        }

        return r;
    }

}
