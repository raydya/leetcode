package com.raydya;

public class MaximumPrimeDifference {

    public int maximumPrimeDifference(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final boolean prime = isPrime(num);
            if (prime) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }

        return max - min;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
