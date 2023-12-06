package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAllAsAppearsBeforeAllBsTest {

    @Test
    public void test1() {
        final CheckIfAllAsAppearsBeforeAllBs solution = new CheckIfAllAsAppearsBeforeAllBs();
        final boolean output = solution.checkString("aaabbb");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfAllAsAppearsBeforeAllBs solution = new CheckIfAllAsAppearsBeforeAllBs();
        final boolean output = solution.checkString("abab");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfAllAsAppearsBeforeAllBs solution = new CheckIfAllAsAppearsBeforeAllBs();
        final boolean output = solution.checkString("bbb");

        Assert.assertTrue(output);
    }
}
