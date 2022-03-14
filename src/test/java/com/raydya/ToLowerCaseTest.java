package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ToLowerCaseTest {

    @Test
    public void test1() {
        final ToLowerCase solution = new ToLowerCase();
        final String output = solution.toLowerCase("Hello");

        Assert.assertEquals("hello", output);
    }

    @Test
    public void test2() {
        final ToLowerCase solution = new ToLowerCase();
        final String output = solution.toLowerCase("here");

        Assert.assertEquals("here", output);
    }

    @Test
    public void test3() {
        final ToLowerCase solution = new ToLowerCase();
        final String output = solution.toLowerCase("LOVELY");

        Assert.assertEquals("lovely", output);
    }

    @Test
    public void test4() {
        final ToLowerCase solution = new ToLowerCase();
        final String output = solution.toLowerCase("Hello@[]");

        Assert.assertEquals("hello@[]", output);
    }
}
