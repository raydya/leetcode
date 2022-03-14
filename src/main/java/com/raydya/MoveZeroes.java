package com.raydya;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int lastZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (lastZeroIndex != i) {
                    nums[lastZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                lastZeroIndex++;
            }
        }
    }
}
