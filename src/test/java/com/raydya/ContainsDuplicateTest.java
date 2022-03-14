package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void test1() {
        final ContainsDuplicate solution = new ContainsDuplicate();
        final boolean containsDuplicate = solution.containsDuplicate(new int[]{1, 2, 3, 1});

        Assert.assertTrue(containsDuplicate);
    }

    @Test
    public void test2() {
        final ContainsDuplicate solution = new ContainsDuplicate();
        final boolean containsDuplicate = solution.containsDuplicate(new int[]{1, 2, 3, 4});

        Assert.assertFalse(containsDuplicate);
    }

    @Test
    public void test3() {
        final ContainsDuplicate solution = new ContainsDuplicate();
        final boolean containsDuplicate = solution.containsDuplicate(
            new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});

        Assert.assertTrue(containsDuplicate);
    }

    @Test
    public void test4() {
        final ContainsDuplicate solution = new ContainsDuplicate();
        final boolean containsDuplicate = solution.containsDuplicate(new int[]{0});

        Assert.assertFalse(containsDuplicate);
    }

    @Test
    public void test5() {
        final ContainsDuplicate solution = new ContainsDuplicate();
        final boolean containsDuplicate = solution.containsDuplicate(new int[]{1, 5, -2, -4, 0});

        Assert.assertFalse(containsDuplicate);
    }
}
