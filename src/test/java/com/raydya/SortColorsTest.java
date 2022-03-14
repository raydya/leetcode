package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortColorsTest {

    @Test
    public void test1() {
        final int[] colors = {2, 0, 2, 1, 1, 0};
        final SortColors solution = new SortColors();
        solution.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, colors);
    }

    @Test
    public void test2() {
        final int[] colors = {2, 0, 1};
        final SortColors solution = new SortColors();
        solution.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0, 1, 2}, colors);
    }

    @Test
    public void test3() {
        final int[] colors = {0};
        final SortColors solution = new SortColors();
        solution.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0}, colors);
    }

    @Test
    public void test4() {
        final int[] colors = {1};
        final SortColors solution = new SortColors();
        solution.sortColors(colors);

        Assert.assertArrayEquals(new int[]{1}, colors);
    }
}
