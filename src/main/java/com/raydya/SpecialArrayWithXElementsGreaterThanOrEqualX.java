package com.raydya;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    public int specialArray(int[] nums) {
        int max = nums.length;

        int eigen = -1;

        for (int i = 1; i <= max; i++) {
            int c = 0;
            for (final int num : nums) {
                if (num >= i) {
                    c++;
                }
            }
            if (c == i) {
                eigen = i;
                break;
            }
        }
        return eigen;
    }

}
