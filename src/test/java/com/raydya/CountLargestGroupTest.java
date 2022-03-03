package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountLargestGroupTest {

    @Test
    public void test1() {
        final CountLargestGroup solution = new CountLargestGroup();
        final int output = solution.countLargestGroup(13);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CountLargestGroup solution = new CountLargestGroup();
        final int output = solution.countLargestGroup(2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final CountLargestGroup solution = new CountLargestGroup();
        final int output = solution.countLargestGroup(15);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test4() {
        final CountLargestGroup solution = new CountLargestGroup();
        final int output = solution.countLargestGroup(24);

        Assert.assertEquals(5, output);
    }
}
