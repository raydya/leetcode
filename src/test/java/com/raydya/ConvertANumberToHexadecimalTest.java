package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConvertANumberToHexadecimalTest {

    @Test
    public void test1() {
        final ConvertANumberToHexadecimal solution = new ConvertANumberToHexadecimal();
        final String hex = solution.toHex(26);

        Assert.assertEquals("1a", hex);
    }

    @Test
    public void test2() {
        final ConvertANumberToHexadecimal solution = new ConvertANumberToHexadecimal();
        final String hex = solution.toHex(-1);

        Assert.assertEquals("ffffffff", hex);
    }
}
