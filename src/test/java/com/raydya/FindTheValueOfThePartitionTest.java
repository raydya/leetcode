package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheValueOfThePartitionTest {

    @Test
    public void test1() {
        final FindTheValueOfThePartition solution = new FindTheValueOfThePartition();
        final int output = solution.findValueOfPartition(new int[]{1, 2, 3, 4});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final FindTheValueOfThePartition solution = new FindTheValueOfThePartition();
        final int output = solution.findValueOfPartition(new int[]{100, 1, 10});

        Assert.assertEquals(9, output);
    }

    @Test
    public void test3() {
        final FindTheValueOfThePartition solution = new FindTheValueOfThePartition();
        final int output = solution.findValueOfPartition(new int[]{59, 51, 1, 98, 73});

        Assert.assertEquals(8, output);
    }
}
