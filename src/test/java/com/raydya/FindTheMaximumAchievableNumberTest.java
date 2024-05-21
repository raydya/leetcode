package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMaximumAchievableNumberTest {

    @Test
    public void test1() {
        final FindTheMaximumAchievableNumber solution = new FindTheMaximumAchievableNumber();
        final int output = solution.theMaximumAchievableX(4, 1);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final FindTheMaximumAchievableNumber solution = new FindTheMaximumAchievableNumber();
        final int output = solution.theMaximumAchievableX(3, 2);

        Assert.assertEquals(7, output);
    }
}
