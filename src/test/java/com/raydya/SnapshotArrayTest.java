package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SnapshotArrayTest {

    @Test
    public void test1() {
        final SnapshotArray solution = new SnapshotArray(3);
        solution.set(0, 5);
        solution.snap();
        solution.set(0, 6);
        final int output = solution.get(0, 0);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final SnapshotArray solution = new SnapshotArray(4);
        solution.snap();
        solution.snap();
        final int output1 = solution.get(3, 1);
        Assert.assertEquals(0, output1);
        solution.set(2, 4);
        solution.snap();
        solution.set(1, 4);
    }

    @Test
    public void test3() {
        final SnapshotArray solution = new SnapshotArray(1);
        solution.set(0, 15);
        solution.snap();
        solution.snap();
        solution.snap();
        final int output1 = solution.get(0, 2);
        Assert.assertEquals(15, output1);
        solution.snap();
        solution.snap();
        final int output2 = solution.get(0, 0);
        Assert.assertEquals(15, output2);
    }
}
