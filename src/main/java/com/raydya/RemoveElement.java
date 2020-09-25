package com.raydya;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        final int length = nums.length;
        if (length == 0) return 0;

        int removedEls = 0;
        int c = 0;

        for (int j = 0; j < length; j++) {
            final int num = nums[j];
            if (num == val) {
                removedEls++;
            } else {
                nums[j - removedEls] = num;
                c++;
            }
        }

        return c;
    }
}
