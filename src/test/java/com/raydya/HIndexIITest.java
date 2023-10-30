package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HIndexIITest {

    @Test
    public void test1() {
        final HIndexII solution = new HIndexII();
        final int output = solution.hIndex(new int[]{0, 1, 3, 5, 6});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final HIndexII solution = new HIndexII();
        final int output = solution.hIndex(new int[]{1, 2, 100});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final HIndexII solution = new HIndexII();
        final int output = solution.hIndex(new int[]{0});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final HIndexII solution = new HIndexII();
        final int output = solution.hIndex(new int[]{0, 0});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final HIndexII solution = new HIndexII();
        final int output = solution.hIndex(new int[]{0, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test6() {
        final HIndexII solution = new HIndexII();
        final int output = solution.hIndex(new int[]{11, 15});

        Assert.assertEquals(2, output);
    }
}
