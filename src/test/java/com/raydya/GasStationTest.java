package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GasStationTest {
    @Test
    public void test1() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{2, 3, 4}, new int[]{3, 4, 3});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{3, 3, 4}, new int[]{3, 4, 4});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test5() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{4, 5, 2, 6, 5, 3}, new int[]{3, 2, 7, 3, 2, 9});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test6() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{3, 1, 1}, new int[]{1, 2, 2});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test7() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{1, 2, 3, 4, 5, 5, 70}, new int[]{2, 3, 4, 3, 9, 6, 2});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test8() {
        final GasStation solution = new GasStation();
        final int output = solution.canComplete(new int[]{2}, new int[]{2});

        Assert.assertEquals(0, output);
    }
}
