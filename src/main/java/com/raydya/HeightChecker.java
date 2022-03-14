package com.raydya;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        final int[] expected = heights.clone();
        Arrays.sort(expected);

        int cnt = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}
