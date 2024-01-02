package com.raydya;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElements {

    public int countElements(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min || nums[i] == max) {
                continue;
            }
            c++;
        }

        return c;
    }

}
