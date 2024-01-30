package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinimumSecondsToEqualizeACircularArrayTest {

    @Test
    public void test1() {
        final MinimumSecondsToEqualizeACircularArray solution = new MinimumSecondsToEqualizeACircularArray();
        final int output = solution.minimumSeconds(Arrays.asList(1, 2, 1, 2));

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumSecondsToEqualizeACircularArray solution = new MinimumSecondsToEqualizeACircularArray();
        final int output = solution.minimumSeconds(Arrays.asList(2, 1, 3, 3, 2));

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MinimumSecondsToEqualizeACircularArray solution = new MinimumSecondsToEqualizeACircularArray();
        final int output = solution.minimumSeconds(Arrays.asList(5, 5, 5, 5));

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final MinimumSecondsToEqualizeACircularArray solution = new MinimumSecondsToEqualizeACircularArray();
        final int output = solution.minimumSeconds(Arrays.asList(3, 19, 8, 12));

        Assert.assertEquals(2, output);
    }

    @Test
    public void test5() {
        final MinimumSecondsToEqualizeACircularArray solution = new MinimumSecondsToEqualizeACircularArray();
        final int output = solution.minimumSeconds(Arrays.asList(8, 8, 9, 10, 9));

        Assert.assertEquals(1, output);
    }
}
