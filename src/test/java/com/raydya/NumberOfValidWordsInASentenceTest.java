package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfValidWordsInASentenceTest {

    @Test
    public void test1() {
        final NumberOfValidWordsInASentence solution = new NumberOfValidWordsInASentence();
        final int output = solution.countValidWords("cat and dog");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfValidWordsInASentence solution = new NumberOfValidWordsInASentence();
        final int output = solution.countValidWords("!this  1-s b8d!");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final NumberOfValidWordsInASentence solution = new NumberOfValidWordsInASentence();
        final int output = solution.countValidWords("alice and  bob are playing stone-game10");

        Assert.assertEquals(5, output);
    }

    @Test
    public void test4() {
        final NumberOfValidWordsInASentence solution = new NumberOfValidWordsInASentence();
        final int output = solution.countValidWords("!");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final NumberOfValidWordsInASentence solution = new NumberOfValidWordsInASentence();
        final int output = solution.countValidWords("a-b-c");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test6() {
        final NumberOfValidWordsInASentence solution = new NumberOfValidWordsInASentence();
        final int output = solution.countValidWords("cn,p ");

        Assert.assertEquals(0, output);
    }
}
