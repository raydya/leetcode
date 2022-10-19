package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class BruteForceCrackingTest {

    @Test
    public void test1() {
        final BruteForceCracking solution = new BruteForceCracking("abcd");
        final String output = solution.crack();

        Assert.assertEquals("abcd", output);
    }

    @Test
    public void test2() {
        final BruteForceCracking solution = new BruteForceCracking("jfndsa");
        final String output = solution.crack();

        Assert.assertEquals("jfndsa", output);
    }

    @Test
    public void test3() {
        final BruteForceCracking solution = new BruteForceCracking("jfndsaw");
        final String output = solution.crack();

        Assert.assertEquals("jfndsaw", output);
    }
}
