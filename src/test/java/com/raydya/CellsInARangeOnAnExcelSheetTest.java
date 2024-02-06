package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CellsInARangeOnAnExcelSheetTest {

    @Test
    public void test1() {
        final CellsInARangeOnAnExcelSheet solution = new CellsInARangeOnAnExcelSheet();
        final List<String> output = solution.cellsInRange("K1:L2");

        Assert.assertEquals(Arrays.asList("K1", "K2", "L1", "L2"), output);
    }

    @Test
    public void test2() {
        final CellsInARangeOnAnExcelSheet solution = new CellsInARangeOnAnExcelSheet();
        final List<String> output = solution.cellsInRange("A1:F1");

        Assert.assertEquals(Arrays.asList("A1", "B1", "C1", "D1", "E1", "F1"), output);
    }
}
