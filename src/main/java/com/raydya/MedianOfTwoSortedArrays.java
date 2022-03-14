package com.raydya;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int m = nums1.length;
        final int n = nums2.length;

        final int[] holder = Arrays.copyOf(nums1, m + n);
        System.arraycopy(nums2, 0, holder, m, nums2.length);
        Arrays.sort(holder);

        final int k = holder.length;

        if (k == 1) {
            return holder[0];
        }

        if (k % 2 == 0) {
            return (holder[k / 2 - 1] + holder[k / 2]) / 2.0;
        }

        return holder[k / 2];
    }
}
