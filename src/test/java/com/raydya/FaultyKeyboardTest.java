package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FaultyKeyboardTest {

    @Test
    public void test1() {
        final FaultyKeyboard solution = new FaultyKeyboard();
        final String output = solution.finalString("string");

        Assert.assertEquals("rtsng", output);
    }

    @Test
    public void test2() {
        final FaultyKeyboard solution = new FaultyKeyboard();
        final String output = solution.finalString("poiinter");

        Assert.assertEquals("ponter", output);
    }
}
