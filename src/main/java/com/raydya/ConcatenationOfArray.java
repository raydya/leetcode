package com.raydya;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        final int[] ret = new int[nums.length * 2];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = nums[i % nums.length];
        }

        return ret;
    }

}
