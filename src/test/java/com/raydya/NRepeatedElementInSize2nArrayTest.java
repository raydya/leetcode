package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NRepeatedElementInSize2nArrayTest {
    @Test
    public void test1() {
        final NRepeatedElementInSize2nArray solution = new NRepeatedElementInSize2nArray();
        final int output = solution.repeatedNTimes(new int[]{1, 2, 3, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NRepeatedElementInSize2nArray solution = new NRepeatedElementInSize2nArray();
        final int output = solution.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final NRepeatedElementInSize2nArray solution = new NRepeatedElementInSize2nArray();
        final int output = solution.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4});

        Assert.assertEquals(5, output);
    }
}
