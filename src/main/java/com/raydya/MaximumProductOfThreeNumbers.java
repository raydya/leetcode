package com.raydya;

public class MaximumProductOfThreeNumbers {
//    public int maximumProduct(int[] nums) {
//        final int l = nums.length;
//
//        if (l <= 3) {
//            int p = 1;
//            for (final int num : nums) {
//                p *= num;
//            }
//            return p;
//        }
//
//        Arrays.sort(nums);
//
//        return Math.max(nums[0] * nums[1] * nums[l - 1], nums[l - 3] * nums[l - 2] * nums[l - 1]);
//    }

    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (final int n : nums) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
