package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleIITest {
    @Test
    public void test1() {
        final PascalsTriangleII solution = new PascalsTriangleII();
        final List<Integer> output = solution.getRow(3);

        Assert.assertEquals(Arrays.asList(1, 3, 3, 1), output);
    }

    @Test
    public void test2() {
        final PascalsTriangleII solution = new PascalsTriangleII();
        final List<Integer> output = solution.getRow(0);

        Assert.assertEquals(Collections.singletonList(1), output);
    }

    @Test
    public void test3() {
        final PascalsTriangleII solution = new PascalsTriangleII();
        final List<Integer> output = solution.getRow(1);

        Assert.assertEquals(Arrays.asList(1, 1), output);
    }
}
