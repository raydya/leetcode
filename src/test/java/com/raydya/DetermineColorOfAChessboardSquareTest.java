package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetermineColorOfAChessboardSquareTest {

    @Test
    public void test1() {
        final DetermineColorOfAChessboardSquare solution = new DetermineColorOfAChessboardSquare();
        final boolean output = solution.squareIsWhite("a1");

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final DetermineColorOfAChessboardSquare solution = new DetermineColorOfAChessboardSquare();
        final boolean output = solution.squareIsWhite("h3");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final DetermineColorOfAChessboardSquare solution = new DetermineColorOfAChessboardSquare();
        final boolean output = solution.squareIsWhite("c7");

        Assert.assertFalse(output);
    }
}
