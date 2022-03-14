package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateReversePolishNotationTest {

    @Test
    public void test1() {
        final EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();
        final int output = solution.evalRPN(new String[]{"2", "1", "+", "3", "*"});

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();
        final int output = solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();
        final int output = solution.evalRPN(
            new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});

        Assert.assertEquals(22, output);
    }
}
