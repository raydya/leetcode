package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLinesToWriteStringTest {

    @Test
    public void test1() {
        final int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10, 10, 10, 10, 10, 10, 10, 10};
        final String s = "abcdefghijklmnopqrstuvwxyz";

        final NumberOfLinesToWriteString solution = new NumberOfLinesToWriteString();
        final int[] output = solution.numberOfLines(widths, s);

        Assert.assertArrayEquals(new int[]{3, 60}, output);
    }

    @Test
    public void test2() {
        final int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10, 10, 10, 10, 10, 10, 10};
        final String s = "bbbcccdddaaa";

        final NumberOfLinesToWriteString solution = new NumberOfLinesToWriteString();
        final int[] output = solution.numberOfLines(widths, s);

        Assert.assertArrayEquals(new int[]{2, 4}, output);
    }

    @Test
    public void test3() {
        final int[] widths = {3, 4, 10, 4, 8, 7, 3, 3, 4, 9, 8, 2, 9, 6, 2, 8, 4, 9, 9, 10, 2, 4, 9,
            10, 8, 2};
        final String s = "mqblbtpvicqhbrejb";

        final NumberOfLinesToWriteString solution = new NumberOfLinesToWriteString();
        final int[] output = solution.numberOfLines(widths, s);

        Assert.assertArrayEquals(new int[]{1, 100}, output);
    }

}
