package com.raydya;

public class FindTheMostCompetitiveSubsequence {

    public int[] mostCompetitive(int[] nums, int k) {
        final int[] stack = new int[k];
        int top = -1;
        final int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (top >= 0 && stack[top] > nums[i] && top + n - i >= k) {
                top--;
            }
            if (top < k - 1) {
                stack[++top] = nums[i];
            }
        }
        return stack;
    }

}
