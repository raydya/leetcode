package com.raydya;

public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int c = 0;
        for (final int k : arr) {
            if (k % 2 > 0) {
                c++;
            } else {
                c = 0;
            }

            if (c == 3) {
                return true;
            }
        }

        return false;
    }

}
