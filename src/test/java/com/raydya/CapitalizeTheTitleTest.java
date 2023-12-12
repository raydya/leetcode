package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CapitalizeTheTitleTest {

    @Test
    public void test1() {
        final CapitalizeTheTitle solution = new CapitalizeTheTitle();
        final String output = solution.capitalizeTitle("capiTalIze tHe titLe");

        Assert.assertEquals("Capitalize The Title", output);
    }

    @Test
    public void test2() {
        final CapitalizeTheTitle solution = new CapitalizeTheTitle();
        final String output = solution.capitalizeTitle("First leTTeR of EACH Word");

        Assert.assertEquals("First Letter of Each Word", output);
    }

    @Test
    public void test3() {
        final CapitalizeTheTitle solution = new CapitalizeTheTitle();
        final String output = solution.capitalizeTitle("i lOve leetcode");

        Assert.assertEquals("i Love Leetcode", output);
    }
}
