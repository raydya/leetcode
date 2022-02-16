package com.raydya;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int ret = Integer.MIN_VALUE;
        for (final int[] account : accounts) {
            int t = 0;
            for (final int i : account) {
                t += i;
            }
            ret = Math.max(t, ret);
        }
        return ret;
    }
}
