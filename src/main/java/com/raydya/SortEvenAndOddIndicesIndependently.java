package com.raydya;

import java.util.Arrays;

public class SortEvenAndOddIndicesIndependently {

    public int[] sortEvenOdd(int[] nums) {
        final int h = nums.length / 2;
        final int r = nums.length % 2;
        int[] even = new int[h + r];
        int[] odd = new int[h];

        int o = 0;
        int e = 0;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (i % 2 == 0) {
                even[e] = num;
                e++;
            } else {
                odd[o] = num;
                o++;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);

        o = odd.length - 1;
        e = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[e];
                e++;
            } else {
                nums[i] = odd[o];
                o--;
            }
        }

        return nums;
    }

}
