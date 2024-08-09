package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheIntegerAddedToArrayIITest {

    @Test
    public void test1() {
        final FindTheIntegerAddedToArrayII solution = new FindTheIntegerAddedToArrayII();
        final int output = solution.minimumAddedInteger(new int[]{4, 20, 16, 12, 8}, new int[]{14, 18, 10});

        Assert.assertEquals(-2, output);
    }

    @Test
    public void test2() {
        final FindTheIntegerAddedToArrayII solution = new FindTheIntegerAddedToArrayII();
        final int output = solution.minimumAddedInteger(new int[]{3, 5, 5, 3}, new int[]{7, 7});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final FindTheIntegerAddedToArrayII solution = new FindTheIntegerAddedToArrayII();
        final int output = solution.minimumAddedInteger(
            new int[]{4, 6, 3, 1, 4, 2, 10, 9, 5},
            new int[]{5, 10, 3, 2, 6, 1, 9}
        );

        Assert.assertEquals(0, output);
    }
}
