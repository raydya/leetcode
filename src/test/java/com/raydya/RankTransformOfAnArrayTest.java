package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RankTransformOfAnArrayTest {

    @Test
    public void test1() {
        final RankTransformOfAnArray solution = new RankTransformOfAnArray();
        final int[] output = solution.arrayRankTransform(new int[]{40, 10, 20, 30});

        Assert.assertArrayEquals(new int[]{4, 1, 2, 3}, output);
    }

    @Test
    public void test2() {
        final RankTransformOfAnArray solution = new RankTransformOfAnArray();
        final int[] output = solution.arrayRankTransform(new int[]{100, 100, 100});

        Assert.assertArrayEquals(new int[]{1, 1, 1}, output);
    }

    @Test
    public void test3() {
        final RankTransformOfAnArray solution = new RankTransformOfAnArray();
        final int[] output = solution.arrayRankTransform(
            new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12});

        Assert.assertArrayEquals(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3}, output);
    }
}
