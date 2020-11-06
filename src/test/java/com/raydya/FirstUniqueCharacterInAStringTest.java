package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterInAStringTest {
    @Test
    public void test1() {
        final FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        final int i = solution.firstUniqueChar("leetcode");

        Assert.assertEquals(0, i);
    }

    @Test
    public void test2() {
        final FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        final int i = solution.firstUniqueChar("loveleetcode");

        Assert.assertEquals(2, i);
    }
}
