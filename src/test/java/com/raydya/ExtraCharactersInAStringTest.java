package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ExtraCharactersInAStringTest {

    @Test
    public void test1() {
        final ExtraCharactersInAString solution = new ExtraCharactersInAString();
        final int output = solution.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final ExtraCharactersInAString solution = new ExtraCharactersInAString();
        final int output = solution.minExtraChar("sayhelloworld", new String[]{"hello", "world"});

        Assert.assertEquals(3, output);
    }
}
