package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BaseballGameTest {

    @Test
    public void test1() {
        final BaseballGame solution = new BaseballGame();
        final int output = solution.calPoints(new String[]{"5", "2", "C", "D", "+"});

        Assert.assertEquals(30, output);
    }

    @Test
    public void test2() {
        final BaseballGame solution = new BaseballGame();
        final int output = solution.calPoints(
            new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"});

        Assert.assertEquals(27, output);
    }

    @Test
    public void test3() {
        final BaseballGame solution = new BaseballGame();
        final int output = solution.calPoints(new String[]{"1"});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final BaseballGame solution = new BaseballGame();
        final int output = solution.calPoints(
            new String[]{"57", "D", "-3", "-58", "D", "77", "+", "C", "+", "+", "38", "78", "-6",
                "24", "-46", "+", "31", "20", "D", "-81"});

        Assert.assertEquals(146, output);
    }
}
