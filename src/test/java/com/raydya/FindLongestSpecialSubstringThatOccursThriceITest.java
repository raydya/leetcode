package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindLongestSpecialSubstringThatOccursThriceITest {

    @Test
    public void test1() {
        final FindLongestSpecialSubstringThatOccursThriceI solution = new FindLongestSpecialSubstringThatOccursThriceI();
        final int output = solution.maximumLength("aaaa");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindLongestSpecialSubstringThatOccursThriceI solution = new FindLongestSpecialSubstringThatOccursThriceI();
        final int output = solution.maximumLength("abcdef");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final FindLongestSpecialSubstringThatOccursThriceI solution = new FindLongestSpecialSubstringThatOccursThriceI();
        final int output = solution.maximumLength("abcaba");

        Assert.assertEquals(1, output);
    }
}
