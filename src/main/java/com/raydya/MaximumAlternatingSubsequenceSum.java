package com.raydya;

public class MaximumAlternatingSubsequenceSum {

    public long maxAlternatingSum(int[] nums) {
        long s = 0;
        long p = 0;
        for (final int n : nums) {
            if (n > p) {
                s += n - p;
            }
            p = n;
        }

        return s;
    }

}
