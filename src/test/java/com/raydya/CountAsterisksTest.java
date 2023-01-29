package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountAsterisksTest {

    @Test
    public void test1() {
        final CountAsterisks solution = new CountAsterisks();
        final int output = solution.countAsterisks("l|*e*et|c**o|*de|");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountAsterisks solution = new CountAsterisks();
        final int output = solution.countAsterisks("iamprogrammer");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountAsterisks solution = new CountAsterisks();
        final int output = solution.countAsterisks("yo|uar|e**|b|e***au|tifu|l");

        Assert.assertEquals(5, output);
    }
}
