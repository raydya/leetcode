package com.raydya;

public class RangeSumQueryImmutable {

    public static class NumArray {

        private final int[] holder;

        public NumArray(int[] nums) {
            holder = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                holder[i + 1] = holder[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return holder[j + 1] - holder[i];
        }
    }
}
