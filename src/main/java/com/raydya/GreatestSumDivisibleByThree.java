package com.raydya;

public class GreatestSumDivisibleByThree {

    public int maxSumDivThree(int[] nums) {
        int[] r = new int[3];
        for (final int n : nums) {
            int a = r[0] + n;
            int b = r[1] + n;
            int c = r[2] + n;

            r[a % 3] = Math.max(r[a % 3], a);
            r[b % 3] = Math.max(r[b % 3], b);
            r[c % 3] = Math.max(r[c % 3], c);
        }

        return r[0];
    }

}
