package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyLettersTest {
    @Test
    public void test1() {
        final ReverseOnlyLetters solution = new ReverseOnlyLetters();
        final String output = solution.reverseOnlyLetters("ab-cd");

        Assert.assertEquals("dc-ba", output);
    }

    @Test
    public void test2() {
        final ReverseOnlyLetters solution = new ReverseOnlyLetters();
        final String output = solution.reverseOnlyLetters("a-bC-dEf-ghIj");

        Assert.assertEquals("j-Ih-gfE-dCba", output);
    }

    @Test
    public void test3() {
        final ReverseOnlyLetters solution = new ReverseOnlyLetters();
        final String output = solution.reverseOnlyLetters("Test1ng-Leet=code-Q!");

        Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", output);
    }
}
