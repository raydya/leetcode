package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {
    @Test
    public void test1() {
        final HappyNumber solution = new HappyNumber();
        final boolean happy = solution.isHappy(19);

        Assert.assertTrue(happy);
    }

    @Test
    public void test2() {
        final HappyNumber solution = new HappyNumber();
        final boolean happy = solution.isHappy(32);

        Assert.assertTrue(happy);
    }

    @Test
    public void test3() {
        final HappyNumber solution = new HappyNumber();
        final boolean happy = solution.isHappy(101);

        Assert.assertFalse(happy);
    }

    @Test
    public void test4() {
        final HappyNumber solution = new HappyNumber();
        final boolean happy = solution.isHappy(146);

        Assert.assertFalse(happy);
    }
}
