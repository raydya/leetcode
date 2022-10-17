package com.raydya;

import com.raydya.ethan.math.CountLineBetweenDots;
import org.junit.Assert;
import org.junit.Test;

public class CountLineBetweenDotsTest {

    @Test
    public void test1() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(4);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test4() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(5);

        Assert.assertEquals(10, output);
    }

    @Test
    public void test5() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(6);

        Assert.assertEquals(15, output);
    }

    @Test
    public void test6() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(1000);

        Assert.assertEquals(499500, output);
    }

    @Test
    public void test7() {
        final CountLineBetweenDots solution = new CountLineBetweenDots();
        final int output = solution.countLine(7);

        Assert.assertEquals(21, output);
    }
}
