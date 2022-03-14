package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void test1() {
        final String input = "Hello World";

        final LengthOfLastWord solution = new LengthOfLastWord();
        final int length = solution.lengthOfLastWord(input);

        Assert.assertEquals(5, length);
    }

    @Test
    public void test2() {
        final String input = "a ";

        final LengthOfLastWord solution = new LengthOfLastWord();
        final int length = solution.lengthOfLastWord(input);

        Assert.assertEquals(1, length);
    }

    @Test
    public void test3() {
        final String input = "b   a    ";

        final LengthOfLastWord solution = new LengthOfLastWord();
        final int length = solution.lengthOfLastWord(input);

        Assert.assertEquals(1, length);
    }
}
