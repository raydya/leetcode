package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PrimeArrangementsTest {

    @Test
    public void test1() {
        final PrimeArrangements solution = new PrimeArrangements();
        final int output = solution.numPrimeArrangements(5);

        Assert.assertEquals(12, output);
    }

    @Test
    public void test2() {
        final PrimeArrangements solution = new PrimeArrangements();
        final int output = solution.numPrimeArrangements(100);

        Assert.assertEquals(682289015, output);
    }
}
