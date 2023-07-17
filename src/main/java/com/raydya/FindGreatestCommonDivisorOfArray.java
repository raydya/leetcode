package com.raydya;

public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (final int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }

        return 1;
    }

}
