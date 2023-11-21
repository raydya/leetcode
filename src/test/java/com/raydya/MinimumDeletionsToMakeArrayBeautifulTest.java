package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDeletionsToMakeArrayBeautifulTest {

    @Test
    public void test1() {
        final MinimumDeletionsToMakeArrayBeautiful solution = new MinimumDeletionsToMakeArrayBeautiful();
        final int output = solution.minDeletion(new int[]{1, 1, 2, 3, 5});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumDeletionsToMakeArrayBeautiful solution = new MinimumDeletionsToMakeArrayBeautiful();
        final int output = solution.minDeletion(new int[]{1, 1, 2, 2, 3, 3});

        Assert.assertEquals(2, output);
    }
}
