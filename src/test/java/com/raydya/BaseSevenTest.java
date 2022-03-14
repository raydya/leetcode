package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BaseSevenTest {

    @Test
    public void test1() {
        final BaseSeven solution = new BaseSeven();
        final String output = solution.convertToBase7(100);

        Assert.assertEquals("202", output);
    }

    @Test
    public void test2() {
        final BaseSeven solution = new BaseSeven();
        final String output = solution.convertToBase7(-7);

        Assert.assertEquals("-10", output);
    }

    @Test
    public void test3() {
        final BaseSeven solution = new BaseSeven();
        final String output = solution.convertToBase7(-8);

        Assert.assertEquals("-11", output);
    }
}
