package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumRepeatingSubstringTest {

    @Test
    public void test1() {
        final MaximumRepeatingSubstring solution = new MaximumRepeatingSubstring();
        final int output = solution.maxRepeating("ababc", "ab");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MaximumRepeatingSubstring solution = new MaximumRepeatingSubstring();
        final int output = solution.maxRepeating("ababc", "ba");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final MaximumRepeatingSubstring solution = new MaximumRepeatingSubstring();
        final int output = solution.maxRepeating("ababc", "ac");

        Assert.assertEquals(0, output);
    }
}
