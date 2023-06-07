package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MiceAndCheeseTest {

    @Test
    public void test1() {
        final MiceAndCheese solution = new MiceAndCheese();
        final int output = solution.miceAndCheese(
            new int[]{1, 1, 3, 4},
            new int[]{4, 4, 1, 1},
            2
        );

        Assert.assertEquals(15, output);
    }

    @Test
    public void test2() {
        final MiceAndCheese solution = new MiceAndCheese();
        final int output = solution.miceAndCheese(
            new int[]{1, 1},
            new int[]{1, 1},
            2
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MiceAndCheese solution = new MiceAndCheese();
        final int output = solution.miceAndCheese(
            new int[]{1, 2, 1, 2, 1, 2},
            new int[]{2, 1, 1, 2, 2, 1},
            0
        );

        Assert.assertEquals(9, output);
    }

    @Test
    public void test4() {
        final MiceAndCheese solution = new MiceAndCheese();
        final int output = solution.miceAndCheese(
            new int[]{2, 2, 1, 2},
            new int[]{1, 2, 1, 2},
            2
        );

        Assert.assertEquals(7, output);
    }

    @Test
    public void test5() {
        final MiceAndCheese solution = new MiceAndCheese();
        final int output = solution.miceAndCheese(
            new int[]{1},
            new int[]{4},
            1
        );

        Assert.assertEquals(1, output);
    }

    @Test
    public void test6() {
        final MiceAndCheese solution = new MiceAndCheese();
        final int output = solution.miceAndCheese(
            new int[]{3, 1, 1, 3},
            new int[]{3, 2, 3, 1},
            3
        );

        Assert.assertEquals(10, output);
    }
}
