package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class XorOperationInAnArrayTest {

    @Test
    public void test1() {
        final XorOperationInAnArray solution = new XorOperationInAnArray();
        final int output = solution.xorOperation(5, 0);

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final XorOperationInAnArray solution = new XorOperationInAnArray();
        final int output = solution.xorOperation(4, 3);

        Assert.assertEquals(8, output);
    }

    @Test
    public void test3() {
        final XorOperationInAnArray solution = new XorOperationInAnArray();
        final int output = solution.xorOperation(1, 7);

        Assert.assertEquals(7, output);
    }

    @Test
    public void test4() {
        final XorOperationInAnArray solution = new XorOperationInAnArray();
        final int output = solution.xorOperation(10, 5);

        Assert.assertEquals(2, output);
    }

}
