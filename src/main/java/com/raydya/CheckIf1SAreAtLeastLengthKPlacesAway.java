package com.raydya;

public class CheckIf1SAreAtLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {
        int p = -1;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num == 1) {
                p = i;
                break;
            }
        }

        for (int i = p + 1; i < nums.length; i++) {
            final int num = nums[i];
            if (num == 1) {
                if (i - p <= k) {
                    return false;
                } else {
                    p = i;
                }
            }
        }

        return true;
    }

}
