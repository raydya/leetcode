package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RelativeRanksTest {

    @Test
    public void test1() {
        final RelativeRanks solution = new RelativeRanks();
        final String[] output = solution.findRelativeRanks(new int[]{5, 4, 3, 2, 1});

        Assert.assertArrayEquals(
            new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, output);
    }
}
