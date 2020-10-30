package com.raydya;

public class MissingNumber {
//    public int missingNumber(int[] nums) {
//        final int length = nums.length;
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < length; i++) {
//            final int num = nums[i];
//
//            if (num != i) return i;
//        }
//
//        return length;
//    }

    // Gauss's Formula
    public int missingNumber(int[] nums) {
        final int length = nums.length;
        final int expectedSum = length * (length + 1) / 2;
        int actualSum = 0;
        for (final int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
