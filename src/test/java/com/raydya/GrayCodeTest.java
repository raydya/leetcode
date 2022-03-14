package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class GrayCodeTest {

    @Test
    public void test1() {
        final GrayCode solution = new GrayCode();
        final List<Integer> output = solution.grayCode(2);

        Assert.assertArrayEquals(new Integer[]{0, 1, 3, 2}, output.toArray());
    }

    @Test
    public void test2() {
        final GrayCode solution = new GrayCode();
        final List<Integer> output = solution.grayCode(1);

        Assert.assertArrayEquals(new Integer[]{0, 1}, output.toArray());
    }
}
