package com.raydya;

public class CountHillsAndValleysInAnArray {

    public int countHillValley(int[] nums) {
        int pd = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            final int c = nums[i];
            if (pd == c) {
                continue;
            }
            int nd = 0;
            for (int j = i + 1; j < nums.length; j++) {
                final int n = nums[j];
                if (c == n) {
                    continue;
                }
                nd = n;
                break;
            }
            if (c > pd && c > nd && nd != 0) {
                count++;
            }
            if (c < pd && c < nd && nd != 0) {
                count++;
            }
            pd = c;
        }
        return count;
    }

}
