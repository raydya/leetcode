package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DistributeMoneyToMaximumChildrenTest {

    @Test
    public void test1() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(20, 3);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(16, 2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(1, 3);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(2, 2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(2, 3);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test6() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(10, 3);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test7() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(4, 2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test8() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(8, 2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test9() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(5, 2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test10() {
        final DistributeMoneyToMaximumChildren solution = new DistributeMoneyToMaximumChildren();
        final int output = solution.distMoney(13, 3);

        Assert.assertEquals(1, output);
    }
}
