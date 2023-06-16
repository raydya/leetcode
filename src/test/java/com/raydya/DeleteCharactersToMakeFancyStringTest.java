package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DeleteCharactersToMakeFancyStringTest {

    @Test
    public void test1() {
        final DeleteCharactersToMakeFancyString solution = new DeleteCharactersToMakeFancyString();
        final String output = solution.makeFancyString("leeetcode");

        Assert.assertEquals("leetcode", output);
    }

    @Test
    public void test2() {
        final DeleteCharactersToMakeFancyString solution = new DeleteCharactersToMakeFancyString();
        final String output = solution.makeFancyString("aaabaaaa");

        Assert.assertEquals("aabaa", output);
    }

    @Test
    public void test3() {
        final DeleteCharactersToMakeFancyString solution = new DeleteCharactersToMakeFancyString();
        final String output = solution.makeFancyString("aab");

        Assert.assertEquals("aab", output);
    }
}
