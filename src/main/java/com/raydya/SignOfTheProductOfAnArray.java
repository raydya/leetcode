package com.raydya;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int t = 1;
        for (final int num : nums) {
            if (num == 0) return 0;
            if (num < 0) t = -t;
        }

        return t;
    }
}
