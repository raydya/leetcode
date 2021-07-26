package com.raydya;

public class CheckIfAllTheIntegersInARangeAreCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] holder = new boolean[right - left + 1];
        for (int i = left; i <= right; i++) {
            for (final int[] range : ranges) {
                if (range[0] <= i && i <= range[1]) {
                    holder[i - left] = true;
                    break;
                }
            }
        }

        for (final boolean b : holder) {
            if (!b) return false;
        }

        return true;
    }
}
