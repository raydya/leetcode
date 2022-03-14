package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SignOfTheProductOfAnArrayTest {

    @Test
    public void test1() {
        final SignOfTheProductOfAnArray solution = new SignOfTheProductOfAnArray();
        final int output = solution.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final SignOfTheProductOfAnArray solution = new SignOfTheProductOfAnArray();
        final int output = solution.arraySign(new int[]{1, 5, 0, 2, -3});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final SignOfTheProductOfAnArray solution = new SignOfTheProductOfAnArray();
        final int output = solution.arraySign(new int[]{-1, 1, -1, 1, -1});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final SignOfTheProductOfAnArray solution = new SignOfTheProductOfAnArray();
        final int output = solution.arraySign(new int[]{
            41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43,
            83, 78, 82, 70, 15,
            -41
        });

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test5() {
        final SignOfTheProductOfAnArray solution = new SignOfTheProductOfAnArray();
        final int output = solution.arraySign(new int[]{
            9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24
        });

        Assert.assertEquals(-1, output);
    }
}
