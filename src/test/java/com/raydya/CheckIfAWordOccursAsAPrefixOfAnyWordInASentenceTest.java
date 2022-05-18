package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {

    @Test
    public void test1() {
        final CheckIfAWordOccursAsAPrefixOfAnyWordInASentence solution = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        final int output = solution.isPrefixOfWord("i love eating burger", "burg");

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CheckIfAWordOccursAsAPrefixOfAnyWordInASentence solution = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        final int output = solution.isPrefixOfWord("this problem is an easy problem", "pro");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final CheckIfAWordOccursAsAPrefixOfAnyWordInASentence solution = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        final int output = solution.isPrefixOfWord("i am tired", "you");

        Assert.assertEquals(-1, output);
    }

}
