package com.raydya;

public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        final int l = nums.length;
        final int[] target = new int[l];

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < i; j++) {
                if (index[j] >= index[i]) {
                    index[j]++;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            final int k = index[i];
            target[k] = nums[i];
        }

        return target;
    }

}
