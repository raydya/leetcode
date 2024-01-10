package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumStringLengthAfterRemovingSubstringsTest {

    @Test
    public void test1() {
        final MinimumStringLengthAfterRemovingSubstrings solution = new MinimumStringLengthAfterRemovingSubstrings();
        final int output = solution.minLength("ABFCACDB");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MinimumStringLengthAfterRemovingSubstrings solution = new MinimumStringLengthAfterRemovingSubstrings();
        final int output = solution.minLength("ACBBD");

        Assert.assertEquals(5, output);
    }

}
