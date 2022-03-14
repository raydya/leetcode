package com.raydya;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        final int[] ret = new int[nums.length];

        final int[] t = nums.clone();
        Arrays.sort(t);
        final int[] h = new int[101];
        Arrays.fill(h, -1);
        for (int i = 0; i < t.length; i++) {
            h[t[i]] = h[t[i]] == -1 ? i : h[t[i]];
        }

        for (int i = 0; i < nums.length; i++) {
            ret[i] = h[nums[i]];
        }

        return ret;
    }
}
