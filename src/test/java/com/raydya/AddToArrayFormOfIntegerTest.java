package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AddToArrayFormOfIntegerTest {
    @Test
    public void test1() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{1, 2, 0, 0}, 34);

        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4}, output.toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{2, 7, 4}, 181);

        Assert.assertArrayEquals(new Integer[]{4, 5, 5}, output.toArray(new Integer[]{}));
    }

    @Test
    public void test3() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{2, 1, 5}, 806);

        Assert.assertArrayEquals(new Integer[]{1, 0, 2, 1}, output.toArray(new Integer[]{}));
    }

    @Test
    public void test4() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1);

        Assert.assertArrayEquals(new Integer[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, output.toArray(new Integer[]{}));
    }

    @Test
    public void test5() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{0}, 0);

        Assert.assertArrayEquals(new Integer[]{0}, output.toArray(new Integer[]{}));
    }

    @Test
    public void test6() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3}, 516);

        Assert.assertArrayEquals(new Integer[]{1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 5, 7, 9}, output.toArray(new Integer[]{}));
    }

    @Test
    public void test7() {
        final AddToArrayFormOfInteger solution = new AddToArrayFormOfInteger();
        final List<Integer> output = solution.addToArrayForm(new int[]{7}, 993);

        Assert.assertArrayEquals(new Integer[]{1, 0, 0, 0}, output.toArray(new Integer[]{}));
    }
}
