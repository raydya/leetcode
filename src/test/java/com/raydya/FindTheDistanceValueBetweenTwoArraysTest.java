package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDistanceValueBetweenTwoArraysTest {

    @Test
    public void test1() {
        final FindTheDistanceValueBetweenTwoArrays solution = new FindTheDistanceValueBetweenTwoArrays();
        final int output = solution.findTheDistanceValue(new int[]{4, 5, 8},
            new int[]{10, 9, 1, 8}, 2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindTheDistanceValueBetweenTwoArrays solution = new FindTheDistanceValueBetweenTwoArrays();
        final int output = solution.findTheDistanceValue(new int[]{1, 4, 2, 3},
            new int[]{-4, -3, 6, 10, 20, 30}, 3);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final FindTheDistanceValueBetweenTwoArrays solution = new FindTheDistanceValueBetweenTwoArrays();
        final int output = solution.findTheDistanceValue(new int[]{2, 1, 100, 3},
            new int[]{-5, -2, 10, -3, 7}, 6);

        Assert.assertEquals(1, output);
    }
}
