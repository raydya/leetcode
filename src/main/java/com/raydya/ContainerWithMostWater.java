package com.raydya;

public class ContainerWithMostWater {
//    /**
//     * brute force
//     *
//     * @param height
//     * @return
//     */
//    public int maxArea(int[] height) {
//        int max = 0;
//
//        for (int i = 0; i < height.length; i++) {
//            for (int j = 0; j < height.length; j++) {
//                final int h = Math.min(height[i], height[j]);
//                final int l = i - j;
//                final int a = h * l;
//                if (a > max) max = a;
//            }
//        }
//
//        return max;
//    }

    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
