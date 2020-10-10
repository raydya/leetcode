package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void test1() {
        final SingleNumber solution = new SingleNumber();
        final int singleNumber = solution.singleNumber(new int[]{2, 2, 1});

        Assert.assertEquals(1, singleNumber);
    }

    @Test
    public void test2() {
        final SingleNumber solution = new SingleNumber();
        final int singleNumber = solution.singleNumber(new int[]{4, 1, 2, 1, 2});

        Assert.assertEquals(4, singleNumber);
    }

    @Test
    public void test3() {
        final SingleNumber solution = new SingleNumber();
        final int singleNumber = solution.singleNumber(new int[]{1});

        Assert.assertEquals(1, singleNumber);
    }

    @Test
    public void test4() {
        final SingleNumber solution = new SingleNumber();
        final int singleNumber = solution.singleNumber(new int[]{-1, -1, -2});

        Assert.assertEquals(-2, singleNumber);
    }
}
