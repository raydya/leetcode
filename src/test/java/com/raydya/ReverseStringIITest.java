package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringIITest {
    @Test
    public void test1() {
        final ReverseStringII solution = new ReverseStringII();
        final String output = solution.reverseStr("abcdefg", 2);

        Assert.assertEquals("bacdfeg", output);
    }

    @Test
    public void test2() {
        final ReverseStringII solution = new ReverseStringII();
        final String output = solution.reverseStr("abcd", 4);

        Assert.assertEquals("dcba", output);
    }
}
