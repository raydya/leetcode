package com.raydya;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int ret = 0;

        for (final int j : nums) {
            int num = j;
            int d = 1;
            while (num >= 10) {
                d++;
                num = num / 10;
            }
            if (d % 2 == 0) ret++;
        }

        return ret;
    }
}
