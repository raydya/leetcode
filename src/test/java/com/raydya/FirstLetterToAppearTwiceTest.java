package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FirstLetterToAppearTwiceTest {

    @Test
    public void test1() {
        final FirstLetterToAppearTwice solution = new FirstLetterToAppearTwice();
        final char output = solution.repeatedCharacter("abccbaacz");

        Assert.assertEquals('c', output);
    }

    @Test
    public void test2() {
        final FirstLetterToAppearTwice solution = new FirstLetterToAppearTwice();
        final char output = solution.repeatedCharacter("abcdd");

        Assert.assertEquals('d', output);
    }
}
