package com.raydya;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num > 0) continue;

            boolean crossed = false;
            for (int j = i - 1; j >= 0; j--) {
                final int n1 = nums[j];
                if (j + n1 > i || j + n1 == nums.length - 1) {
                    crossed = true;
                    break;
                }
            }

            if (!crossed) {
                return false;
            }
        }

        return true;
    }
}
