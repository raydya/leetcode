package com.raydya;

import java.util.Arrays;

public class ThirdMaximumNumber {
//    public int thirdMax(int[] nums) {
//        final List<Integer> list = Arrays.stream(nums)
//            .boxed()
//            .distinct()
//            .sorted(Comparator.reverseOrder())
//            .collect(Collectors.toList());
//
//        final int size = list.size();
//
//        if (size < 3) return list.get(0);
//
//        return list.get(2);
//    }

    public int thirdMax(int[] nums) {
        long[] h = new long[3];
        Arrays.fill(h, Long.MIN_VALUE);
        Arrays.sort(nums);

        for (final int num : nums) {
            if (h[0] == Long.MIN_VALUE) {
                h[0] = num;
            } else {
                if (num > h[0]) {
                    h[2] = h[1];
                    h[1] = h[0];
                    h[0] = num;
                }
            }
        }

        return h[2] == Long.MIN_VALUE ? (int) h[0] : (int) h[2];
    }
}
