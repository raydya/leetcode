package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumFuelCostToReportToTheCapitalTest {

    @Test
    public void test1() {
        final MinimumFuelCostToReportToTheCapital solution = new MinimumFuelCostToReportToTheCapital();
        final long output = solution.minimumFuelCost(
            new int[][]{
                {0, 1}, {0, 2}, {0, 3}
            },
            5);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumFuelCostToReportToTheCapital solution = new MinimumFuelCostToReportToTheCapital();
        final long output = solution.minimumFuelCost(
            new int[][]{
                {3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}
            },
            2);

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final MinimumFuelCostToReportToTheCapital solution = new MinimumFuelCostToReportToTheCapital();
        final long output = solution.minimumFuelCost(
            new int[][]{},
            1);

        Assert.assertEquals(0, output);
    }
}
