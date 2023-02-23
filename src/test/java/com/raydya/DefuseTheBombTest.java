package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DefuseTheBombTest {

    @Test
    public void test1() {
        final DefuseTheBomb solution = new DefuseTheBomb();
        final int[] output = solution.decrypt(new int[]{5, 7, 1, 4}, 3);

        Assert.assertArrayEquals(new int[]{12, 10, 16, 13}, output);
    }

    @Test
    public void test2() {
        final DefuseTheBomb solution = new DefuseTheBomb();
        final int[] output = solution.decrypt(new int[]{1, 2, 3, 4}, 0);

        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, output);
    }

    @Test
    public void test3() {
        final DefuseTheBomb solution = new DefuseTheBomb();
        final int[] output = solution.decrypt(new int[]{2, 4, 9, 3}, -2);

        Assert.assertArrayEquals(new int[]{12, 5, 6, 13}, output);
    }
}
