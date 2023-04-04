package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfArrayIsSortedAndRotatedTest {

    @Test
    public void test1() {
        final CheckIfArrayIsSortedAndRotated solution = new CheckIfArrayIsSortedAndRotated();
        final boolean output = solution.check(new int[]{3, 4, 5, 1, 2});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfArrayIsSortedAndRotated solution = new CheckIfArrayIsSortedAndRotated();
        final boolean output = solution.check(new int[]{2, 1, 3, 4});

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final CheckIfArrayIsSortedAndRotated solution = new CheckIfArrayIsSortedAndRotated();
        final boolean output = solution.check(new int[]{1, 2, 3});

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final CheckIfArrayIsSortedAndRotated solution = new CheckIfArrayIsSortedAndRotated();
        final boolean output = solution.check(new int[]{6, 10, 6});

        Assert.assertTrue(output);
    }

    @Test
    public void test6() {
        final CheckIfArrayIsSortedAndRotated solution = new CheckIfArrayIsSortedAndRotated();
        final boolean output = solution.check(new int[]{7, 9, 1, 1, 1, 3});

        Assert.assertTrue(output);
    }
}
