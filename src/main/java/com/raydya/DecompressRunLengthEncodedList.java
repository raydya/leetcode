package com.raydya;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i += 2) {
            l += nums[i];
        }

        final int[] ret = new int[l];

        int x = 0;
        for (int i = 1; i < nums.length; i += 2) {
            final int num = nums[i - 1];
            for (int j = 0; j < num; j++) {
                ret[x] = nums[i];
                x++;
            }
        }

        return ret;
    }
}
