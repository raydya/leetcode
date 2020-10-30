package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {
    @Test
    public void test1() {
        final MissingNumber solution = new MissingNumber();
        final int missingNumber = solution.missingNumber(new int[]{3, 0, 1});

        Assert.assertEquals(2, missingNumber);
    }

    @Test
    public void test2() {
        final MissingNumber solution = new MissingNumber();
        final int missingNumber = solution.missingNumber(new int[]{0, 1});

        Assert.assertEquals(2, missingNumber);
    }

    @Test
    public void test3() {
        final MissingNumber solution = new MissingNumber();
        final int missingNumber = solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});

        Assert.assertEquals(8, missingNumber);
    }

    @Test
    public void test4() {
        final MissingNumber solution = new MissingNumber();
        final int missingNumber = solution.missingNumber(new int[]{0});

        Assert.assertEquals(1, missingNumber);
    }
}
