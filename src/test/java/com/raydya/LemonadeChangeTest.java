package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LemonadeChangeTest {
    @Test
    public void test1() {
        final LemonadeChange solution = new LemonadeChange();
        final boolean output = solution.lemonadeChange(new int[]{5, 5, 5, 10, 20});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final LemonadeChange solution = new LemonadeChange();
        final boolean output = solution.lemonadeChange(new int[]{5, 5, 10, 10, 20});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final LemonadeChange solution = new LemonadeChange();
        final boolean output = solution.lemonadeChange(new int[]{5, 5, 10});

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final LemonadeChange solution = new LemonadeChange();
        final boolean output = solution.lemonadeChange(new int[]{10, 10});

        Assert.assertFalse(output);
    }

    @Test
    public void test5() {
        final LemonadeChange solution = new LemonadeChange();
        final boolean output = solution.lemonadeChange(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5});

        Assert.assertTrue(output);
    }
}
