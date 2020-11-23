package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSumTest {
    @Test
    public void test1() {
        final FourSum solution = new FourSum();
        final List<List<Integer>> answer = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        Assert.assertArrayEquals(
            Arrays.asList(
                Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-1, 0, 0, 1)
            ).toArray(),
            answer.toArray()
        );
    }

    @Test
    public void test2() {
        final FourSum solution = new FourSum();
        final List<List<Integer>> answer = solution.fourSum(new int[]{}, 0);

        Assert.assertArrayEquals(
            Collections.emptyList().toArray(),
            answer.toArray()
        );
    }

    @Test
    public void test3() {
        final FourSum solution = new FourSum();
        final List<List<Integer>> answer = solution.fourSum(new int[]{0, 0, 0, 0}, 0);

        Assert.assertArrayEquals(
            Collections.singletonList(
                Arrays.asList(0, 0, 0, 0)
            ).toArray(),
            answer.toArray()
        );
    }
}
