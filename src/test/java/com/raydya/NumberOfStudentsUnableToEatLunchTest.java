package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStudentsUnableToEatLunchTest {

    @Test
    public void test1() {
        final NumberOfStudentsUnableToEatLunch solution = new NumberOfStudentsUnableToEatLunch();
        final int output = solution.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final NumberOfStudentsUnableToEatLunch solution = new NumberOfStudentsUnableToEatLunch();
        final int output = solution.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1});

        Assert.assertEquals(3, output);
    }
}
