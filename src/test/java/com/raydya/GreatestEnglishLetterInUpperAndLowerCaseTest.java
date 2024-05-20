package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GreatestEnglishLetterInUpperAndLowerCaseTest {

    @Test
    public void test1() {
        final GreatestEnglishLetterInUpperAndLowerCase solution = new GreatestEnglishLetterInUpperAndLowerCase();
        final String output = solution.greatestLetter("lEeTcOdE");

        Assert.assertEquals("E", output);
    }

    @Test
    public void test2() {
        final GreatestEnglishLetterInUpperAndLowerCase solution = new GreatestEnglishLetterInUpperAndLowerCase();
        final String output = solution.greatestLetter("arRAzFif");

        Assert.assertEquals("R", output);
    }

    @Test
    public void test3() {
        final GreatestEnglishLetterInUpperAndLowerCase solution = new GreatestEnglishLetterInUpperAndLowerCase();
        final String output = solution.greatestLetter("AbCdEfGhIjK");

        Assert.assertEquals("", output);
    }
}
