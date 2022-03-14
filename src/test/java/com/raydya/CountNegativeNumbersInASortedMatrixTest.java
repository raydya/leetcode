package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountNegativeNumbersInASortedMatrixTest {

    @Test
    public void test1() {
        final CountNegativeNumbersInASortedMatrix solution = new CountNegativeNumbersInASortedMatrix();
        final int output = solution.countNegatives(
            new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final CountNegativeNumbersInASortedMatrix solution = new CountNegativeNumbersInASortedMatrix();
        final int output = solution.countNegatives(new int[][]{{3, 2}, {1, 0}});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountNegativeNumbersInASortedMatrix solution = new CountNegativeNumbersInASortedMatrix();
        final int output = solution.countNegatives(new int[][]{{1, -1}, {-1, -1}});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final CountNegativeNumbersInASortedMatrix solution = new CountNegativeNumbersInASortedMatrix();
        final int output = solution.countNegatives(new int[][]{{-1}});

        Assert.assertEquals(1, output);
    }
}
