package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TeemoAttackingTest {

    @Test
    public void test1() {
        final TeemoAttacking solution = new TeemoAttacking();
        final int output = solution.findPoisonedDuration(new int[]{1, 4}, 2);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final TeemoAttacking solution = new TeemoAttacking();
        final int output = solution.findPoisonedDuration(new int[]{1, 2}, 2);

        Assert.assertEquals(3, output);
    }
}
