package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class CombinationLotteryTest {

    @Test
    public void test1() {
        final CombinationLottery solution = new CombinationLottery();
        final long output = solution.calc(20, 1, 5, 10);

        Assert.assertEquals(232792560, output);
    }

}
