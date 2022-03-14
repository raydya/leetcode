package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumMovesToEqualArrayElementsTest {

    @Test
    public void test1() {
        final MinimumMovesToEqualArrayElements solution = new MinimumMovesToEqualArrayElements();
        final int output = solution.minMoves(new int[]{1, 2, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumMovesToEqualArrayElements solution = new MinimumMovesToEqualArrayElements();
        final int output = solution.minMoves(new int[]{-1, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MinimumMovesToEqualArrayElements solution = new MinimumMovesToEqualArrayElements();
        final int output = solution.minMoves(new int[]{-100, 0, 100});

        Assert.assertEquals(300, output);
    }

    @Test
    public void test4() {
        final MinimumMovesToEqualArrayElements solution = new MinimumMovesToEqualArrayElements();
        final int output = solution.minMoves(new int[]{1, 1, 1000000000});

        Assert.assertEquals(999999999, output);
    }
}
