package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {
    @Test
    public void test1() {
        final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        final int number = solution.titleToNumber("A");

        Assert.assertEquals(1, number);
    }

    @Test
    public void test2() {
        final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        final int number = solution.titleToNumber("Z");

        Assert.assertEquals(26, number);
    }

    @Test
    public void test3() {
        final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        final int number = solution.titleToNumber("AA");

        Assert.assertEquals(27, number);
    }

    @Test
    public void test4() {
        final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        final int number = solution.titleToNumber("AB");

        Assert.assertEquals(28, number);
    }

    @Test
    public void test5() {
        final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        final int number = solution.titleToNumber("AAA");

        Assert.assertEquals(703, number);
    }

    @Test
    public void test6() {
        final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        final int number = solution.titleToNumber("AZ");

        Assert.assertEquals(52, number);
    }
}
