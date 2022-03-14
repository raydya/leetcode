package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberInASortedArrayTest {

    @Test
    public void test1() {
        final FindNumberInASortedArray solution = new FindNumberInASortedArray();
        final int output = solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindNumberInASortedArray solution = new FindNumberInASortedArray();
        final int output = solution.search(new int[]{5, 7, 7, 8, 8, 10}, 6);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final FindNumberInASortedArray solution = new FindNumberInASortedArray();
        final int output = solution.search(new int[]{5, 7, 7, 8, 8, 8, 10}, 8);

        Assert.assertEquals(3, output);
    }
}
