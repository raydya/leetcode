package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArithmeticSubarraysTest {

    @Test
    public void test1() {
        final ArithmeticSubarrays solution = new ArithmeticSubarrays();
        final List<Boolean> output = solution.checkArithmeticSubarrays(
            new int[]{4, 6, 5, 9, 3, 7},
            new int[]{0, 0, 2},
            new int[]{2, 3, 5}
        );

        Assert.assertArrayEquals(new Boolean[]{true, false, true}, output.toArray());
    }

    @Test
    public void test2() {
        final ArithmeticSubarrays solution = new ArithmeticSubarrays();
        final List<Boolean> output = solution.checkArithmeticSubarrays(
            new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10},
            new int[]{0, 1, 6, 4, 8, 7},
            new int[]{4, 4, 9, 7, 9, 10}
        );

        Assert.assertArrayEquals(new Boolean[]{false, true, false, false, true, true}, output.toArray());
    }

}
