package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    @Test
    public void test1() {
        final AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        final double output = solution.average(new int[]{4000, 3000, 1000, 2000});

        Assert.assertEquals(2500.00000, output, 0.0);
    }

    @Test
    public void test2() {
        final AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        final double output = solution.average(new int[]{1000, 2000, 3000});

        Assert.assertEquals(2000.00000, output, 0.0);
    }

    @Test
    public void test3() {
        final AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        final double output = solution.average(new int[]{6000, 5000, 4000, 3000, 2000, 1000});

        Assert.assertEquals(3500.00000, output, 0.0);
    }

    @Test
    public void test4() {
        final AverageSalaryExcludingTheMinimumAndMaximumSalary solution = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        final double output = solution.average(new int[]{8000, 9000, 2000, 3000, 6000, 1000});

        Assert.assertEquals(4750.00000, output, 0.0);
    }
}
