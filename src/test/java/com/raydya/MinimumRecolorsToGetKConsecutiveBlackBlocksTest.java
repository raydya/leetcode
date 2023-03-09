package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {

    @Test
    public void test1() {
        final MinimumRecolorsToGetKConsecutiveBlackBlocks solution = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        final int output = solution.minimumRecolors("WBBWWBBWBW", 7);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumRecolorsToGetKConsecutiveBlackBlocks solution = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        final int output = solution.minimumRecolors("WBWBBBW", 2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final MinimumRecolorsToGetKConsecutiveBlackBlocks solution = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        final int output = solution.minimumRecolors("BWWWBB", 6);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final MinimumRecolorsToGetKConsecutiveBlackBlocks solution = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        final int output = solution.minimumRecolors("W", 1);

        Assert.assertEquals(1, output);
    }
}
