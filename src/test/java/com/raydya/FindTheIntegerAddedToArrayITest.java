package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheIntegerAddedToArrayITest {

    @Test
    public void test1() {
        final FindTheIntegerAddedToArrayI solution = new FindTheIntegerAddedToArrayI();
        final int output = solution.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final FindTheIntegerAddedToArrayI solution = new FindTheIntegerAddedToArrayI();
        final int output = solution.addedInteger(new int[]{10}, new int[]{5});

        Assert.assertEquals(-5, output);
    }

    @Test
    public void test3() {
        final FindTheIntegerAddedToArrayI solution = new FindTheIntegerAddedToArrayI();
        final int output = solution.addedInteger(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1});

        Assert.assertEquals(0, output);
    }
}
