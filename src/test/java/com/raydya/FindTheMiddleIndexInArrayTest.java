package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMiddleIndexInArrayTest {

    @Test
    public void test1() {
        final FindTheMiddleIndexInArray solution = new FindTheMiddleIndexInArray();
        final int output = solution.findMiddleIndex(new int[]{2, 3, -1, 8, 4});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final FindTheMiddleIndexInArray solution = new FindTheMiddleIndexInArray();
        final int output = solution.findMiddleIndex(new int[]{1, -1, 4});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final FindTheMiddleIndexInArray solution = new FindTheMiddleIndexInArray();
        final int output = solution.findMiddleIndex(new int[]{2, 5});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final FindTheMiddleIndexInArray solution = new FindTheMiddleIndexInArray();
        final int output = solution.findMiddleIndex(new int[]{1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final FindTheMiddleIndexInArray solution = new FindTheMiddleIndexInArray();
        final int output = solution.findMiddleIndex(new int[]{4, 2, 1, -3});

        Assert.assertEquals(0, output);
    }
}
