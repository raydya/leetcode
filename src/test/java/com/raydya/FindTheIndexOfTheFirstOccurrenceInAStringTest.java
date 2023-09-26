package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    public void test1() {
        final FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
        final int output = solution.strStr("sadbutsad", "sad");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
        final int output = solution.strStr("leetcode", "leeto");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
        final int output = solution.strStr("a", "a");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
        final int output = solution.strStr("abc", "c");

        Assert.assertEquals(2, output);
    }
}
