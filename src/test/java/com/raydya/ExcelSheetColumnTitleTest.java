package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnTitleTest {

    @Test
    public void test1() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(1);

        Assert.assertEquals("A", s);
    }

    @Test
    public void test2() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(28);

        Assert.assertEquals("AB", s);
    }

    @Test
    public void test3() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(701);

        Assert.assertEquals("ZY", s);
    }

    @Test
    public void test4() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(26);

        Assert.assertEquals("Z", s);
    }


    @Test
    public void test5() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(27);

        Assert.assertEquals("AA", s);
    }

    @Test
    public void test6() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(52);

        Assert.assertEquals("AZ", s);
    }

    @Test
    public void test7() {
        final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        final String s = solution.convertToTitle(703);

        Assert.assertEquals("AAA", s);
    }
}
