package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetectPatternOfLengthMRepeatedKOrMoreTimesTest {

    @Test
    public void test1() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2);

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(new int[]{1, 2, 1, 2, 1, 3}, 2, 3);

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(new int[]{1, 2, 3, 1, 2}, 2, 2);

        Assert.assertFalse(output);
    }

    @Test
    public void test5() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(new int[]{2, 2, 2, 2}, 2, 3);

        Assert.assertFalse(output);
    }

    @Test
    public void test6() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(new int[]{3, 2, 2, 1, 2, 2, 1, 1, 1, 2, 3, 2, 2}, 3, 2);

        Assert.assertTrue(output);
    }

    @Test
    public void test7() {
        final DetectPatternOfLengthMRepeatedKOrMoreTimes solution = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        final boolean output = solution.containsPattern(
            new int[]{4, 2, 2, 2, 2, 4, 3, 4, 2, 1, 3, 4, 3, 4, 4, 2, 1, 3, 4}, 3, 2);

        Assert.assertFalse(output);
    }
}
