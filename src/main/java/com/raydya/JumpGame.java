package com.raydya;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;

        int fi = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final int i1 = i + num;
            if (i1 > fi) {
                fi = i1;
            }
            if (num > 0) continue;

            if (fi <= i && fi != nums.length - 1) return false;
        }

        return true;
    }
}
