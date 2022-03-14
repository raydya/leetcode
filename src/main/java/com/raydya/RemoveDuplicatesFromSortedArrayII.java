package com.raydya;

public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int curr = nums[0], count = 0, actual_length = 0, length = 0;
        for (int num : nums) {
            actual_length++;
            if (num == curr) {
                count += 1;
                if (count < 3) {
                    length++;
                }
            } else {
                curr = num;
                count = 1;
                length++;
            }
            if (length < actual_length) {
                nums[length - 1] = num;
            }
        }
        return length;
    }
}
