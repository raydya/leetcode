package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CanMakeArithmeticProgressionFromSequenceTest {

    @Test
    public void test1() {
        final CanMakeArithmeticProgressionFromSequence solution = new CanMakeArithmeticProgressionFromSequence();
        final boolean output = solution.canMakeArithmeticProgression(new int[]{3, 5, 1});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CanMakeArithmeticProgressionFromSequence solution = new CanMakeArithmeticProgressionFromSequence();
        final boolean output = solution.canMakeArithmeticProgression(new int[]{1, 2, 4});

        Assert.assertFalse(output);
    }
}
