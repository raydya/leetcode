package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReformatDateTest {

    @Test
    public void test1() {
        final ReformatDate solution = new ReformatDate();
        final String output = solution.reformatDate("20th Oct 2052");

        Assert.assertEquals("2052-10-20", output);
    }

    @Test
    public void test2() {
        final ReformatDate solution = new ReformatDate();
        final String output = solution.reformatDate("6th Jun 1933");

        Assert.assertEquals("1933-06-06", output);
    }

    @Test
    public void test3() {
        final ReformatDate solution = new ReformatDate();
        final String output = solution.reformatDate("26th May 1960");

        Assert.assertEquals("1960-05-26", output);
    }

}
