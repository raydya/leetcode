package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConstructTheRectangleTest {

    @Test
    public void test1() {
        final ConstructTheRectangle solution = new ConstructTheRectangle();
        final int[] output = solution.constructRectangle(4);

        Assert.assertArrayEquals(new int[]{2, 2}, output);
    }

    @Test
    public void test2() {
        final ConstructTheRectangle solution = new ConstructTheRectangle();
        final int[] output = solution.constructRectangle(9);

        Assert.assertArrayEquals(new int[]{3, 3}, output);
    }

    @Test
    public void test3() {
        final ConstructTheRectangle solution = new ConstructTheRectangle();
        final int[] output = solution.constructRectangle(7);

        Assert.assertArrayEquals(new int[]{7, 1}, output);
    }

    @Test
    public void test4() {
        final ConstructTheRectangle solution = new ConstructTheRectangle();
        final int[] output = solution.constructRectangle(121);

        Assert.assertArrayEquals(new int[]{11, 11}, output);
    }

    @Test
    public void test5() {
        final ConstructTheRectangle solution = new ConstructTheRectangle();
        final int[] output = solution.constructRectangle(24);

        Assert.assertArrayEquals(new int[]{6, 4}, output);
    }
}
