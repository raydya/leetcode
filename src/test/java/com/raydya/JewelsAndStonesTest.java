package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void test1() {
        final JewelsAndStones solution = new JewelsAndStones();
        final int output = solution.numJewelsInStones("aA", "aAAbbbb");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final JewelsAndStones solution = new JewelsAndStones();
        final int output = solution.numJewelsInStones("z", "ZZ");

        Assert.assertEquals(0, output);
    }
}
