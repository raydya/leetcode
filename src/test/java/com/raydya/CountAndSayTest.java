package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {

    @Test
    public void test1() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(1);

        Assert.assertEquals("1", output);
    }

    @Test
    public void test2() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(2);

        Assert.assertEquals("11", output);
    }

    @Test
    public void test3() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(3);

        Assert.assertEquals("21", output);
    }

    @Test
    public void test4() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(4);

        Assert.assertEquals("1211", output);
    }

    @Test
    public void test5() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(5);

        Assert.assertEquals("111221", output);
    }

    @Test
    public void test6() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(6);

        Assert.assertEquals("312211", output);
    }

    @Test
    public void test7() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(7);

        Assert.assertEquals("13112221", output);
    }

    @Test
    public void test8() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(8);

        Assert.assertEquals("1113213211", output);
    }

    @Test
    public void test9() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(9);

        Assert.assertEquals("31131211131221", output);
    }

    @Test
    public void test10() {
        final CountAndSay solution = new CountAndSay();
        final String output = solution.countAndSay(10);

        Assert.assertEquals("13211311123113112211", output);
    }
}
