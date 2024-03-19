package com.raydya;

public class FindClosestNumberToZero {

    public int findClosestNumber(int[] nums) {
        int closest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final int abs = Math.abs(num);
            if (abs < min) {
                min = abs;
                closest = num;
            } else if (abs == min) {
                closest = Math.max(closest, num);
            }
        }

        return closest;
    }

}
