package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SpecialArrayIITest {

    @Test
    public void test1() {
        final SpecialArrayII solution = new SpecialArrayII();
        final boolean[] output = solution.isArraySpecial(
            new int[]{3, 4, 1, 2, 6},
            new int[][]{{0, 4}}
        );

        Assert.assertArrayEquals(new boolean[]{false}, output);
    }

    @Test
    public void test2() {
        final SpecialArrayII solution = new SpecialArrayII();
        final boolean[] output = solution.isArraySpecial(
            new int[]{4, 3, 1, 6},
            new int[][]{{0, 2}, {2, 3}}
        );

        Assert.assertArrayEquals(new boolean[]{false, true}, output);
    }

    @Test
    public void test3() {
        final SpecialArrayII solution = new SpecialArrayII();
        final boolean[] output = solution.isArraySpecial(
            new int[]{4, 5, 2, 7},
            new int[][]{{1, 3}}
        );

        Assert.assertArrayEquals(new boolean[]{true}, output);
    }
}
