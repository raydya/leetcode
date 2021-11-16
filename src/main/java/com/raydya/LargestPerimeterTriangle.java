package com.raydya;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        int mp = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            final int a = nums[i];
            final int b = nums[i - 1];
            final int c = nums[i - 2];

            final double s = heronsFormula(a, b, c);

            if (s > 0) {
                mp = a + b + c;
                break;
            }
        }

        return mp;
    }

    private double heronsFormula(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        final double k = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(k);
    }
}
