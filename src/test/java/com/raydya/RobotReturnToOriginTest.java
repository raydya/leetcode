package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RobotReturnToOriginTest {
    @Test
    public void test1() {
        final RobotReturnToOrigin solution = new RobotReturnToOrigin();
        final boolean output = solution.judgeCircle("UD");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RobotReturnToOrigin solution = new RobotReturnToOrigin();
        final boolean output = solution.judgeCircle("LL");

        Assert.assertFalse(output);
    }
}
