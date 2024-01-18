package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemovingMinimumOfMagicBeansTest {

    @Test
    public void test1() {
        final RemovingMinimumOfMagicBeans solution = new RemovingMinimumOfMagicBeans();
        final long output = solution.minimumRemoval(new int[]{4, 1, 6, 5});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final RemovingMinimumOfMagicBeans solution = new RemovingMinimumOfMagicBeans();
        final long output = solution.minimumRemoval(new int[]{2, 10, 3, 2});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final RemovingMinimumOfMagicBeans solution = new RemovingMinimumOfMagicBeans();
        final long output = solution.minimumRemoval(new int[]{63, 43, 12, 94});

        Assert.assertEquals(83, output);
    }
}
