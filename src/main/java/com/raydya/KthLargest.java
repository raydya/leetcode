package com.raydya;

import java.util.Arrays;

public class KthLargest {
    private int[] oNums;
    private int i;
    private final int kth;

    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        this.oNums = nums;
        this.i = nums.length - k;
        this.kth = k;
    }

    public int add(int val) {
        final int[] c = Arrays.copyOf(oNums, oNums.length + 1);
        c[c.length - 1] = val;
        Arrays.sort(c);
        this.oNums = c;
        this.i = c.length - kth;
        return oNums[i];
    }
}
