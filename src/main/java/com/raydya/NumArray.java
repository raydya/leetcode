package com.raydya;

//public class NumArray {
//    private final int[] holder;
//
//    public NumArray(int[] nums) {
//        this.holder = nums;
//    }
//
//    public int sumRange(int i, int j) {
//        int t = 0;
//        for (int k = i; k <= j; k++) {
//            t += holder[k];
//        }
//
//        return t;
//    }
//}

public class NumArray {
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
