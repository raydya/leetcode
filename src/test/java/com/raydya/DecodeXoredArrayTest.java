package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DecodeXoredArrayTest {

    @Test
    public void test1() {
        final DecodeXoredArray solution = new DecodeXoredArray();
        final int[] output = solution.decode(new int[]{1, 2, 3}, 1);

        Assert.assertArrayEquals(
            new int[]{1, 0, 2, 1},
            output
        );
    }

    @Test
    public void test2() {
        final DecodeXoredArray solution = new DecodeXoredArray();
        final int[] output = solution.decode(new int[]{6, 2, 7, 3}, 4);

        Assert.assertArrayEquals(
            new int[]{4, 2, 0, 7, 4},
            output
        );
    }
}
