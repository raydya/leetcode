package com.raydya;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int f = 0, s = 0;
        int result = 0;
        while (f < nums1.length && s < nums2.length) {
            if (nums1[f] < nums2[s]) {
                f++;
            } else if (nums1[f] > nums2[s]) {
                s++;
            } else {
                nums1[result++] = nums1[f];
                f++;
                s++;
            }
        }

        return Arrays.copyOf(nums1, result);
    }
}
