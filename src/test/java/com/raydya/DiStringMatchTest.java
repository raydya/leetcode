package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DiStringMatchTest {
    @Test
    public void test1() {
        final DiStringMatch solution = new DiStringMatch();
        final int[] output = solution.diStringMatch("IDID");

        Assert.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, output);
    }

    @Test
    public void test2() {
        final DiStringMatch solution = new DiStringMatch();
        final int[] output = solution.diStringMatch("III");

        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, output);
    }

    @Test
    public void test3() {
        final DiStringMatch solution = new DiStringMatch();
        final int[] output = solution.diStringMatch("DDI");

        Assert.assertArrayEquals(new int[]{3, 2, 0, 1}, output);
    }
}
