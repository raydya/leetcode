package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindSmallestLetterGreaterThanTargetTest {

    @Test
    public void test1() {
        final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
        final char output = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a');

        Assert.assertEquals('c', output);
    }

    @Test
    public void test2() {
        final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
        final char output = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');

        Assert.assertEquals('f', output);
    }

    @Test
    public void test3() {
        final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
        final char output = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd');

        Assert.assertEquals('f', output);
    }

    @Test
    public void test4() {
        final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
        final char output = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g');

        Assert.assertEquals('j', output);
    }

    @Test
    public void test5() {
        final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
        final char output = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j');

        Assert.assertEquals('c', output);
    }

    @Test
    public void test6() {
        final FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();
        final char output = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k');

        Assert.assertEquals('c', output);
    }
}
