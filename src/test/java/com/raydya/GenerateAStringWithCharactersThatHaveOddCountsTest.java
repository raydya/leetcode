package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GenerateAStringWithCharactersThatHaveOddCountsTest {

    @Test
    public void test1() {
        final GenerateAStringWithCharactersThatHaveOddCounts solution = new GenerateAStringWithCharactersThatHaveOddCounts();
        final String output = solution.generateTheString(4);

        Assert.assertEquals("aaab", output);
    }

    @Test
    public void test2() {
        final GenerateAStringWithCharactersThatHaveOddCounts solution = new GenerateAStringWithCharactersThatHaveOddCounts();
        final String output = solution.generateTheString(2);

        Assert.assertEquals("ab", output);
    }

    @Test
    public void test3() {
        final GenerateAStringWithCharactersThatHaveOddCounts solution = new GenerateAStringWithCharactersThatHaveOddCounts();
        final String output = solution.generateTheString(7);

        Assert.assertEquals("aaaaaaa", output);
    }
}
