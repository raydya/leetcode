package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class Maximum69NumberTest {
    @Test
    public void test1() {
        final Maximum69Number solution = new Maximum69Number();
        final int output = solution.maximum69Number(9669);

        Assert.assertEquals(9969, output);
    }

    @Test
    public void test2() {
        final Maximum69Number solution = new Maximum69Number();
        final int output = solution.maximum69Number(9996);

        Assert.assertEquals(9999, output);
    }

    @Test
    public void test3() {
        final Maximum69Number solution = new Maximum69Number();
        final int output = solution.maximum69Number(9999);

        Assert.assertEquals(9999, output);
    }
}
