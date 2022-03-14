package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsTest {

    @Test
    public void test1() {
        final AddDigits solution = new AddDigits();
        final int i = solution.addDigits(38);

        Assert.assertEquals(2, i);
    }
}
