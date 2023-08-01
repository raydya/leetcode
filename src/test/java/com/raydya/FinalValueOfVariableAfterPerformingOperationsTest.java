package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FinalValueOfVariableAfterPerformingOperationsTest {

    @Test
    public void test1() {
        final FinalValueOfVariableAfterPerformingOperations solution = new FinalValueOfVariableAfterPerformingOperations();
        final int output = solution.finalValueAfterOperations(new String[]{"--X", "X++", "X++"});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final FinalValueOfVariableAfterPerformingOperations solution = new FinalValueOfVariableAfterPerformingOperations();
        final int output = solution.finalValueAfterOperations(new String[]{"++X", "++X", "X++"});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final FinalValueOfVariableAfterPerformingOperations solution = new FinalValueOfVariableAfterPerformingOperations();
        final int output = solution.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"});

        Assert.assertEquals(0, output);
    }
}
