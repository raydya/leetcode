package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void test1() {
        int[] input = new int[]{3, 2, 2, 3};

        final RemoveElement solution = new RemoveElement();
        final int length = solution.removeElement(input, 3);

        Assert.assertEquals(2, length);
        Assert.assertEquals(2, input[0]);
        Assert.assertEquals(2, input[1]);
    }

    @Test
    public void test2() {
        int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

        final RemoveElement solution = new RemoveElement();
        final int length = solution.removeElement(input, 2);

        Assert.assertEquals(5, length);
        Assert.assertEquals(0, input[0]);
        Assert.assertEquals(1, input[1]);
        Assert.assertEquals(3, input[2]);
        Assert.assertEquals(0, input[3]);
        Assert.assertEquals(4, input[4]);
    }
}
