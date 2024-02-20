package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        final int[] h1 = new int[2002];
        final int[] h2 = new int[2002];

        for (int i = 0; i < nums1.length; i++) {
            h1[nums1[i] + 1000]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            h2[nums2[i] + 1000]++;
        }

        Set<Integer> l1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            final int k = nums1[i];
            if (h2[k + 1000] == 0) {
                l1.add(k);
            }
        }

        Set<Integer> l2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            final int k = nums2[i];
            if (h1[k + 1000] == 0) {
                l2.add(k);
            }
        }

        final List<Integer> a1 = new ArrayList<>(l1);
        final List<Integer> a2 = new ArrayList<>(l2);

        return Arrays.asList(a1, a2);
    }
}
