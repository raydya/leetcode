package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindPeakElementTest {

    @Test
    public void test1() {
        final FindPeakElement solution = new FindPeakElement();
        final int output = solution.findPeakElement(new int[]{1, 2, 3, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindPeakElement solution = new FindPeakElement();
        final int output = solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});

        Assert.assertEquals(1, output);
    }
}
