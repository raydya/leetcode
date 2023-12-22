package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DivideAStringIntoGroupsOfSizeKTest {

    @Test
    public void test1() {
        final DivideAStringIntoGroupsOfSizeK solution = new DivideAStringIntoGroupsOfSizeK();
        final String[] output = solution.divideString("abcdefghi", 3, 'x');

        Assert.assertArrayEquals(new String[]{"abc", "def", "ghi"}, output);
    }

    @Test
    public void test2() {
        final DivideAStringIntoGroupsOfSizeK solution = new DivideAStringIntoGroupsOfSizeK();
        final String[] output = solution.divideString("abcdefghij", 3, 'x');

        Assert.assertArrayEquals(new String[]{"abc", "def", "ghi", "jxx"}, output);
    }
}
