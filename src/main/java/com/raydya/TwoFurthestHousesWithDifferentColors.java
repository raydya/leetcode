package com.raydya;

public class TwoFurthestHousesWithDifferentColors {

    public int maxDistance(int[] colors) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < colors.length; i++) {
            for (int j = colors.length - 1; j >= 0; j--) {
                if (colors[i] != colors[j]) {
                    m = Math.max(m, j - i);
                }
            }
        }

        return m;
    }

}
