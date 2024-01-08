package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfBoomerangsTest {

    @Test
    public void test1() {
        final NumberOfBoomerangs solution = new NumberOfBoomerangs();
        final int output = solution.numberOfBoomerangs(new int[][]{
            {0, 0},
            {1, 0},
            {2, 0}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final NumberOfBoomerangs solution = new NumberOfBoomerangs();
        final int output = solution.numberOfBoomerangs(new int[][]{
            {1, 1},
            {2, 2},
            {3, 3}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final NumberOfBoomerangs solution = new NumberOfBoomerangs();
        final int output = solution.numberOfBoomerangs(new int[][]{
            {1, 1}
        });

        Assert.assertEquals(0, output);
    }
}
