package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PeakIndexInAMountainArrayTest {
    @Test
    public void test1() {
        final PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray();
        final int output = solution.peakIndexInMountainArray(new int[]{0, 1, 0});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray();
        final int output = solution.peakIndexInMountainArray(new int[]{0, 2, 1, 0});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray();
        final int output = solution.peakIndexInMountainArray(new int[]{0, 10, 5, 2});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray();
        final int output = solution.peakIndexInMountainArray(new int[]{3, 4, 5, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test5() {
        final PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray();
        final int output = solution.peakIndexInMountainArray(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test6() {
        final PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray();
        final int output = solution.peakIndexInMountainArray(new int[]{18, 29, 38, 59, 98, 100, 99, 98, 90});

        Assert.assertEquals(5, output);
    }
}
