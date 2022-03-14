package com.raydya;

public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= first) {
                first = nums[i];
            } else if (nums[i] >= second) {
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}
