package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EvaluateDivisionTest {
    @Test
    public void test1() {
        final EvaluateDivision solution = new EvaluateDivision();
        final double[] output = solution.calcEquation(
            Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c")
            ),
            new double[]{2.0, 3.0},
            Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a"),
                Arrays.asList("x", "x")
            )
        );

        Assert.assertArrayEquals(new double[]{6.0, 0.5, -1.0, 1.0, -1.0}, output, 0);
    }

    @Test
    public void test2() {
        final EvaluateDivision solution = new EvaluateDivision();
        final double[] output = solution.calcEquation(
            Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c"),
                Arrays.asList("bc", "cd")
            ),
            new double[]{1.5, 2.5, 5.0},
            Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"),
                Arrays.asList("cd", "bc")
            )
        );

        Assert.assertArrayEquals(new double[]{3.75, 0.4, 5.0, 0.2}, output, 0);
    }

    @Test
    public void test3() {
        final EvaluateDivision solution = new EvaluateDivision();
        final double[] output = solution.calcEquation(
            Arrays.asList(
                Arrays.asList("a", "b")
            ),
            new double[]{0.5},
            Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "c"),
                Arrays.asList("x", "y")
            )
        );

        Assert.assertArrayEquals(new double[]{0.5, 2.0, -1.0, -1.0}, output, 0);
    }
}
