package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArraysTest {
    @Test
    public void test1() {
        final IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        final int[] intersection = solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        Assert.assertArrayEquals(new int[]{2}, intersection);
    }

    @Test
    public void test2() {
        final IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        final int[] intersection = solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        Assert.assertArrayEquals(new int[]{4, 9}, intersection);
    }

    @Test
    public void test3() {
        final int[] nums1 = {61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81};
        final int[] nums2 = {5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48};

        final IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        final int[] intersection = solution.intersection(nums1, nums2);

        Assert.assertArrayEquals(new int[]{61, 45, 85, 89, 5, 77, 92, 38, 7, 34, 44, 57, 4, 6, 88, 0, 79}, intersection);
    }
}
