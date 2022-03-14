package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyStringsTest {

    @Test
    public void test1() {
        final MultiplyStrings solution = new MultiplyStrings();
        final String output = solution.multiply("2", "3");

        Assert.assertEquals("6", output);
    }

    @Test
    public void test2() {
        final MultiplyStrings solution = new MultiplyStrings();
        final String output = solution.multiply("123", "456");

        Assert.assertEquals("56088", output);
    }
}
