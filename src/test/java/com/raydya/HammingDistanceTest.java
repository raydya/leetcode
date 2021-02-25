package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {
    @Test
    public void test1() {
        final HammingDistance solution = new HammingDistance();
        final int output = solution.hammingDistance(1, 4);

        Assert.assertEquals(2, output);
    }
}
