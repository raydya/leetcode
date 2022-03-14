package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SplitAStringInBalancedStringsTest {

    @Test
    public void test1() {
        final SplitAStringInBalancedStrings solution = new SplitAStringInBalancedStrings();
        final int output = solution.balancedStringSplit("RLRRLLRLRL");

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final SplitAStringInBalancedStrings solution = new SplitAStringInBalancedStrings();
        final int output = solution.balancedStringSplit("RLLLLRRRLR");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final SplitAStringInBalancedStrings solution = new SplitAStringInBalancedStrings();
        final int output = solution.balancedStringSplit("LLLLRRRR");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final SplitAStringInBalancedStrings solution = new SplitAStringInBalancedStrings();
        final int output = solution.balancedStringSplit("RLRRRLLRLL");

        Assert.assertEquals(2, output);
    }
}
