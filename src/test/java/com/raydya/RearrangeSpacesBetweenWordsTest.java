package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RearrangeSpacesBetweenWordsTest {

    @Test
    public void test1() {
        final RearrangeSpacesBetweenWords solution = new RearrangeSpacesBetweenWords();
        final String output = solution.recordSpaces("  this   is  a sentence ");

        Assert.assertEquals("this   is   a   sentence", output);
    }

    @Test
    public void test2() {
        final RearrangeSpacesBetweenWords solution = new RearrangeSpacesBetweenWords();
        final String output = solution.recordSpaces(" practice   makes   perfect");

        Assert.assertEquals("practice   makes   perfect ", output);
    }

    @Test
    public void test3() {
        final RearrangeSpacesBetweenWords solution = new RearrangeSpacesBetweenWords();
        final String output = solution.recordSpaces("hello   world");

        Assert.assertEquals("hello   world", output);
    }

    @Test
    public void test4() {
        final RearrangeSpacesBetweenWords solution = new RearrangeSpacesBetweenWords();
        final String output = solution.recordSpaces("  walks  udp package   into  bar a");

        Assert.assertEquals("walks  udp  package  into  bar  a ", output);
    }

    @Test
    public void test5() {
        final RearrangeSpacesBetweenWords solution = new RearrangeSpacesBetweenWords();
        final String output = solution.recordSpaces("a");

        Assert.assertEquals("a", output);
    }

    @Test
    public void test6() {
        final RearrangeSpacesBetweenWords solution = new RearrangeSpacesBetweenWords();
        final String output = solution.recordSpaces(" hello");

        Assert.assertEquals("hello ", output);
    }

}
