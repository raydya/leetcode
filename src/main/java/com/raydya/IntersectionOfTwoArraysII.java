package com.raydya;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] iterator = nums1.length > nums2.length ? nums2 : nums1;
        int[] target = nums1.length > nums2.length ? nums1 : nums2;

        int[] holder = new int[]{};

        for (final int i : iterator) {
            final int b = contains(holder, i);
            if (b > 0) continue;

            final int c = contains(target, i);
            if (c > 0) {
                final int a = contains(iterator, i);
                final int d = Math.min(a, c);
                final int[] ints = Arrays.copyOf(holder, holder.length + d);
                for (int j = ints.length - 1; j > ints.length - 1 - d; j--) {
                    ints[j] = i;
                }
                holder = ints;
            }
        }

        return holder;
    }

    private int contains(int[] ints, int num) {
        int c = 0;
        for (final int anInt : ints) {
            if (anInt == num) c++;
        }
        return c;
    }
}
