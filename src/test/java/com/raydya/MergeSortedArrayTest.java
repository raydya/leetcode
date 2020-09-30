package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {
    @Test
    public void test1() {
        final MergeSortedArray solution = new MergeSortedArray();
        final int[] nums1 = {1, 2, 3, 0, 0, 0};
        final int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }
}
