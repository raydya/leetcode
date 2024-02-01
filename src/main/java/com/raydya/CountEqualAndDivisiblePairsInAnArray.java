package com.raydya;

public class CountEqualAndDivisiblePairsInAnArray {

    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            final int n1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                final int n2 = nums[j];
                if (n1 == n2 & (i * j) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
