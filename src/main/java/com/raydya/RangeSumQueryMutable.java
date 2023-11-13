package com.raydya;

public class RangeSumQueryMutable {

    public static class NumArray {

        private final int[] origin;
        private final int[] holder;

        public NumArray(int[] nums) {
            this.origin = nums;
            this.holder = new int[origin.length + 1];
            for (int i = 0; i < origin.length; i++) {
                holder[i + 1] = holder[i] + origin[i];
            }
        }

        public void update(int index, int val) {
            origin[index] = val;
            for (int i = index; i < origin.length; i++) {
                holder[i + 1] = holder[i] + origin[i];
            }
        }

        public int sumRange(int left, int right) {
            return holder[right + 1] - holder[left];
        }
    }

}
