package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            final int n = nums2[i];
            int v = -1;
            for (int j = i; j < nums2.length; j++) {
                if (nums2[j] > n) {
                    v = nums2[j];
                    break;
                }
            }
            map.put(n, v);
        }

        final int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            final int n = nums1[i];
            final Integer v = map.get(n);
            ret[i] = v;
        }

        return ret;
    }
}
