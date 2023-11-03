package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstPalindromicStringInTheArrayTest {

    @Test
    public void test1() {
        final FindFirstPalindromicStringInTheArray solution = new FindFirstPalindromicStringInTheArray();
        final String output = solution.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"});

        Assert.assertEquals("ada", output);
    }

    @Test
    public void test2() {
        final FindFirstPalindromicStringInTheArray solution = new FindFirstPalindromicStringInTheArray();
        final String output = solution.firstPalindrome(new String[]{"notapalindrome", "racecar"});

        Assert.assertEquals("racecar", output);
    }

    @Test
    public void test3() {
        final FindFirstPalindromicStringInTheArray solution = new FindFirstPalindromicStringInTheArray();
        final String output = solution.firstPalindrome(new String[]{"def", "ghi"});

        Assert.assertEquals("", output);
    }
}
