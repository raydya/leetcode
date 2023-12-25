package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NumberOfBurgersWithNoWasteOfIngredientsTest {

    @Test
    public void test1() {
        final NumberOfBurgersWithNoWasteOfIngredients solution = new NumberOfBurgersWithNoWasteOfIngredients();
        final List<Integer> output = solution.numOfBurgers(16, 7);

        Assert.assertArrayEquals(new Integer[]{1, 6}, output.toArray());
    }

    @Test
    public void test2() {
        final NumberOfBurgersWithNoWasteOfIngredients solution = new NumberOfBurgersWithNoWasteOfIngredients();
        final List<Integer> output = solution.numOfBurgers(17, 4);

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test3() {
        final NumberOfBurgersWithNoWasteOfIngredients solution = new NumberOfBurgersWithNoWasteOfIngredients();
        final List<Integer> output = solution.numOfBurgers(4, 17);

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test4() {
        final NumberOfBurgersWithNoWasteOfIngredients solution = new NumberOfBurgersWithNoWasteOfIngredients();
        final List<Integer> output = solution.numOfBurgers(0, 0);

        Assert.assertArrayEquals(new Integer[]{0, 0}, output.toArray());
    }

    @Test
    public void test5() {
        final NumberOfBurgersWithNoWasteOfIngredients solution = new NumberOfBurgersWithNoWasteOfIngredients();
        final List<Integer> output = solution.numOfBurgers(2, 1);

        Assert.assertArrayEquals(new Integer[]{0, 1}, output.toArray());
    }
}
