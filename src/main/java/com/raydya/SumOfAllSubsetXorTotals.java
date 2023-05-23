package com.raydya;

public class SumOfAllSubsetXorTotals {

    private int t = 0;

    public int subsetXORSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        recursion(nums, 0, 0);
        return t;
    }

    private void recursion(int[] nums, int idx, int v) {
        if (idx == nums.length) {
            t += v;
            return;
        }

        recursion(nums, idx + 1, v ^ nums[idx]);
        recursion(nums, idx + 1, v);
    }

}
