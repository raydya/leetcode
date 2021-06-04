package com.raydya;

public class MinimumMovesToEqualArrayElements {
//    public int minMoves(int[] nums) {
//        Arrays.sort(nums);
//        int count = 0;
//        for (int i = nums.length - 1; i > 0; i--) {
//            count += nums[i] - nums[0];
//        }
//        return count;
//    }

    public int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (final int num : nums) {
            min = Math.min(min, num);
        }
        for (final int num : nums) {
            moves += num - min;
        }
        return moves;
    }
}
