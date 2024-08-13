package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SpecialArrayITest {

    @Test
    public void test1() {
        final SpecialArrayI solution = new SpecialArrayI();
        final boolean output = solution.isArraySpecial(new int[]{1});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final SpecialArrayI solution = new SpecialArrayI();
        final boolean output = solution.isArraySpecial(new int[]{2, 1, 4});

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final SpecialArrayI solution = new SpecialArrayI();
        final boolean output = solution.isArraySpecial(new int[]{4, 3, 1, 6});

        Assert.assertFalse(output);
    }
}
