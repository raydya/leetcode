package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void test1() {
        final LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        final List<String> combinations = solution.letterCombinations("23");

        combinations.sort(Comparator.naturalOrder());

        Assert.assertArrayEquals(
            Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf").toArray(),
            combinations.toArray()
        );
    }

    @Test
    public void test2() {
        final LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        final List<String> combinations = solution.letterCombinations("");

        Assert.assertArrayEquals(
            Collections.emptyList().toArray(),
            combinations.toArray()
        );
    }

    @Test
    public void test3() {
        final LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        final List<String> combinations = solution.letterCombinations("2");

        Assert.assertArrayEquals(
            Arrays.asList("a", "b", "c").toArray(),
            combinations.toArray()
        );
    }
}
