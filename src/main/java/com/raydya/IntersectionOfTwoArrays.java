package com.raydya;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] holder = new int[]{};

        for (final int i1 : nums1) {
            if (contains(holder, i1)) continue;

            if (contains(nums2, i1)) {
                final int[] ints = Arrays.copyOf(holder, holder.length + 1);
                ints[ints.length - 1] = i1;
                holder = ints;
            }
        }

        return holder;
    }

    private boolean contains(int[] ints, int num) {
        for (final int anInt : ints) {
            if (anInt == num) return true;
        }
        return false;
    }
}
