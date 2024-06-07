package com.raydya;

public class MaximumNumberOfOperationsWithTheSameScore {

    public int maxOperations(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int count = 1;
        int p = nums[0] + nums[1];
        int i = 2;

        while (i < nums.length - 1) {
            int k = nums[i] + nums[i + 1];
            if (k == p) {
                count++;
                i += 2;
            } else {
                break;
            }
        }

        return count;
    }

}
