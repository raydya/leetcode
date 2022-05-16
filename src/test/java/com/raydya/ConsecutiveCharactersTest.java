package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveCharactersTest {

    @Test
    public void test1() {
        final ConsecutiveCharacters solution = new ConsecutiveCharacters();
        final int output = solution.maxPower("leetcode");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final ConsecutiveCharacters solution = new ConsecutiveCharacters();
        final int output = solution.maxPower("abbcccddddeeeeedcba");

        Assert.assertEquals(5, output);
    }

    @Test
    public void test3() {
        final ConsecutiveCharacters solution = new ConsecutiveCharacters();
        final int output = solution.maxPower("tourist");

        Assert.assertEquals(1, output);
    }


}
