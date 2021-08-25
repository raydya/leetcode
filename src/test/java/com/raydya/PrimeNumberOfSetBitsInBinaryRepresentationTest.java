package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberOfSetBitsInBinaryRepresentationTest {
    @Test
    public void test1() {
        final PrimeNumberOfSetBitsInBinaryRepresentation solution = new PrimeNumberOfSetBitsInBinaryRepresentation();
        final int output = solution.countPrimeSetBits(6, 10);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final PrimeNumberOfSetBitsInBinaryRepresentation solution = new PrimeNumberOfSetBitsInBinaryRepresentation();
        final int output = solution.countPrimeSetBits(10, 15);

        Assert.assertEquals(5, output);
    }
}
