package com.raydya;

public class BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int s = 0;
        int e = nums.length - 1;
        int i = (s + e) / 2;

        while (e > s && e - s > 1) {
            if (target == nums[i]) {
                return i;
            }
            if (target > nums[i]) {
                s = i;
            } else {
                e = i;
            }
            i = (s + e) / 2;
        }

        if (nums[s] == target) {
            return s;
        }
        if (nums[e] == target) {
            return e;
        }

        return -1;
    }
}
