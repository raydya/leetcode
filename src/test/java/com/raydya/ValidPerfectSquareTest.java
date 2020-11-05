package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidPerfectSquareTest {
    @Test
    public void test1() {
        final ValidPerfectSquare solution = new ValidPerfectSquare();
        final boolean perfectSquare = solution.isPerfectSquare(16);

        Assert.assertTrue(perfectSquare);
    }

    @Test
    public void test2() {
        final ValidPerfectSquare solution = new ValidPerfectSquare();
        final boolean perfectSquare = solution.isPerfectSquare(14);

        Assert.assertFalse(perfectSquare);
    }
}
