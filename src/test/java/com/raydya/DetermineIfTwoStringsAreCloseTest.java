package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetermineIfTwoStringsAreCloseTest {

    @Test
    public void test1() {
        final DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();
        final boolean output = solution.closeStrings("abc", "bca");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();
        final boolean output = solution.closeStrings("a", "aa");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();
        final boolean output = solution.closeStrings("cabbba", "abbccc");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();
        final boolean output = solution.closeStrings("cabbba", "aabbss");

        Assert.assertFalse(output);
    }

    @Test
    public void test5() {
        final DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();
        final boolean output = solution.closeStrings("yyyuxuyuxxxxxxxyyyyyxxyyxxxyyyxyx",
            "uxuxuuuuuuxuuyuuuuuuyuuuuuuuyyuuu");

        Assert.assertFalse(output);
    }

}
