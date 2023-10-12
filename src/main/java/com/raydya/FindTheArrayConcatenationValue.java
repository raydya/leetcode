package com.raydya;

public class FindTheArrayConcatenationValue {

    public long findTheArrayConcVal(int[] nums) {
        long ret = 0;

        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (i == j) {
                ret += nums[i];
            } else {
                final int a = nums[i];
                final int b = nums[j];
                final long c = (long) Math.pow(10, String.valueOf(b).length());
                ret += a * c + b;
            }
            i++;
            j--;
        }

        return ret;
    }

}
