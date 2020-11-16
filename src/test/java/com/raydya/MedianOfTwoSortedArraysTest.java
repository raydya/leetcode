package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void test1() {
        final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        final double median = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        Assert.assertEquals(2.0, median, 0.0);
    }

    @Test
    public void test2() {
        final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        final double median = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        Assert.assertEquals(2.5, median, 0.0);
    }

    @Test
    public void test3() {
        final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        final double median = solution.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0});

        Assert.assertEquals(0.0, median, 0.0);
    }

    @Test
    public void test4() {
        final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        final double median = solution.findMedianSortedArrays(new int[]{}, new int[]{1});

        Assert.assertEquals(1.0, median, 0.0);
    }

    @Test
    public void test5() {
        final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        final double median = solution.findMedianSortedArrays(new int[]{2}, new int[]{});

        Assert.assertEquals(2.0, median, 0.0);
    }
}
