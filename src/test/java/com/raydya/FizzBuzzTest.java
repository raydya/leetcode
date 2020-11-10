package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FizzBuzzTest {
    @Test
    public void test1() {
        final FizzBuzz solution = new FizzBuzz();
        final List<String> fizzBuzz = solution.fizzBuzz(15);

        final String[] expected = new String[]{
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        };
        final List<String> strings = Arrays.asList(expected);

        Assert.assertEquals(
            new HashSet<>(strings),
            new HashSet<>(fizzBuzz)
        );
    }
}
