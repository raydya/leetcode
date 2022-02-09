package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNAndItsDoubleExistTest {
    @Test
    public void test1() {
        final CheckIfNAndItsDoubleExist solution = new CheckIfNAndItsDoubleExist();
        final boolean output = solution.checkIfExist(new int[]{10, 2, 5, 3});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfNAndItsDoubleExist solution = new CheckIfNAndItsDoubleExist();
        final boolean output = solution.checkIfExist(new int[]{7, 1, 14, 11});

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final CheckIfNAndItsDoubleExist solution = new CheckIfNAndItsDoubleExist();
        final boolean output = solution.checkIfExist(new int[]{3, 1, 7, 11});

        Assert.assertFalse(output);
    }
}
