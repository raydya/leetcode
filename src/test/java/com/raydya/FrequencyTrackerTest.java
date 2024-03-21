package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FrequencyTrackerTest {

    @Test
    public void test1() {
        final FrequencyTracker solution = new FrequencyTracker();
        solution.add(3);
        solution.add(3);
        final boolean output = solution.hasFrequency(2);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final FrequencyTracker solution = new FrequencyTracker();
        solution.add(1);
        solution.deleteOne(1);
        final boolean output = solution.hasFrequency(1);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final FrequencyTracker solution = new FrequencyTracker();
        final boolean output1 = solution.hasFrequency(2);
        Assert.assertFalse(output1);

        solution.add(3);
        final boolean output = solution.hasFrequency(1);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final FrequencyTracker solution = new FrequencyTracker();
        solution.add(9);
        final boolean output1 = solution.hasFrequency(1);
        Assert.assertTrue(output1);

        solution.add(4);
        solution.add(9);

        final boolean output2 = solution.hasFrequency(1);
        Assert.assertTrue(output2);

        final boolean output3 = solution.hasFrequency(1);
        Assert.assertTrue(output3);
    }

    @Test
    public void test5() {
        final FrequencyTracker solution = new FrequencyTracker();
        solution.add(5);
        solution.add(5);

        final boolean output1 = solution.hasFrequency(1);
        Assert.assertFalse(output1);

        final boolean output2 = solution.hasFrequency(2);
        Assert.assertTrue(output2);

        solution.add(6);
        solution.add(5);
        solution.add(1);
    }
}
