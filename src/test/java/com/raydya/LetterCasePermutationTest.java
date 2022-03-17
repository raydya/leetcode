package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class LetterCasePermutationTest {

    @Test
    public void test1() {
        final LetterCasePermutation solution = new LetterCasePermutation();
        final List<String> output = solution.letterCasePermutation("a1b2");

        Assert.assertArrayEquals(new String[]{"a1b2", "a1B2", "A1B2", "A1b2"}, output.toArray());
    }

    @Test
    public void test2() {
        final LetterCasePermutation solution = new LetterCasePermutation();
        final List<String> output = solution.letterCasePermutation("3z4");

        Assert.assertArrayEquals(new String[]{"3z4", "3Z4"}, output.toArray());
    }
}
