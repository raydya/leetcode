package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GrumpyBookstoreOwnerTest {

    @Test
    public void test1() {
        final GrumpyBookstoreOwner solution = new GrumpyBookstoreOwner();
        final int output = solution.maxSatisfied(
            new int[]{1, 0, 1, 2, 1, 1, 7, 5},
            new int[]{0, 1, 0, 1, 0, 1, 0, 1},
            3
        );

        Assert.assertEquals(16, output);
    }

    @Test
    public void test2() {
        final GrumpyBookstoreOwner solution = new GrumpyBookstoreOwner();
        final int output = solution.maxSatisfied(
            new int[]{1},
            new int[]{0},
            1
        );

        Assert.assertEquals(1, output);
    }
}
