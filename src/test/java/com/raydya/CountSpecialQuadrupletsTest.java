package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountSpecialQuadrupletsTest {

    @Test
    public void test1() {
        final CountSpecialQuadruplets solution = new CountSpecialQuadruplets();
        final int output = solution.countQuadruplets(new int[]{1, 2, 3, 6});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final CountSpecialQuadruplets solution = new CountSpecialQuadruplets();
        final int output = solution.countQuadruplets(new int[]{3, 3, 6, 4, 5});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountSpecialQuadruplets solution = new CountSpecialQuadruplets();
        final int output = solution.countQuadruplets(new int[]{1, 1, 1, 3, 5});

        Assert.assertEquals(4, output);
    }
}
