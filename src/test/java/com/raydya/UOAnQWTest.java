package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UOAnQWTest {

    @Test
    public void test1() {
        final UOAnQW solution = new UOAnQW();
        final int output = solution.maximumScore(new int[]{1, 2, 8, 9}, 3);

        Assert.assertEquals(18, output);
    }

    @Test
    public void test2() {
        final UOAnQW solution = new UOAnQW();
        final int output = solution.maximumScore(new int[]{3, 3, 1}, 1);

        Assert.assertEquals(0, output);
    }
}
