package com.raydya;

import java.util.Arrays;

public class MostFrequentEvenElement {

    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);

        final int[] h = new int[100001];
        int m = 0;
        int k = -1;
        for (final int num : nums) {
            h[num]++;
            if (h[num] > m && num % 2 == 0) {
                m = h[num];
                k = num;
            }
        }

        return k;
    }
}
