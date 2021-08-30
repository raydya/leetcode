package com.raydya;

import org.junit.Test;

public class RandomPickWithWeightTest {
    @Test
    public void test1() {
        final RandomPickWithWeight solution = new RandomPickWithWeight(new int[]{1});
        final int i = solution.pickIndex();

    }

    @Test
    public void test2() {
        final RandomPickWithWeight solution = new RandomPickWithWeight(new int[]{1, 3});
        final int i = solution.pickIndex();

    }
}
