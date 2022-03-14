package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {

    @Test
    public void test1() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{3, 2, 1});

        Assert.assertEquals(1, thirdMax);
    }

    @Test
    public void test2() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{1, 2});

        Assert.assertEquals(2, thirdMax);
    }

    @Test
    public void test3() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{2, 2, 3, 1});

        Assert.assertEquals(1, thirdMax);
    }

    @Test
    public void test4() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{1, 1, 2});

        Assert.assertEquals(2, thirdMax);
    }

    @Test
    public void test5() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{5, 2, 2});

        Assert.assertEquals(5, thirdMax);
    }

    @Test
    public void test6() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{2, 2, 2, 1});

        Assert.assertEquals(2, thirdMax);
    }

    @Test
    public void test7() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{1, 2, -2147483648});

        Assert.assertEquals(-2147483648, thirdMax);
    }

    @Test
    public void test8() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{1, 2, 2, 5, 3, 5});

        Assert.assertEquals(2, thirdMax);
    }

    @Test
    public void test9() {
        final ThirdMaximumNumber solution = new ThirdMaximumNumber();
        final int thirdMax = solution.thirdMax(new int[]{1, -2147483648, 2});

        Assert.assertEquals(-2147483648, thirdMax);
    }
}
