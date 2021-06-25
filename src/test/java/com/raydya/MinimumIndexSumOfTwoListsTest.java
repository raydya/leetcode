package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumIndexSumOfTwoListsTest {
    @Test
    public void test1() {
        final String[] andy = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        final String[] doris = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        final MinimumIndexSumOfTwoLists solution = new MinimumIndexSumOfTwoLists();
        final String[] output = solution.findRestaurant(andy, doris);

        Assert.assertArrayEquals(new String[]{"Shogun"}, output);
    }

    @Test
    public void test2() {
        final String[] andy = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        final String[] doris = {"KFC", "Shogun", "Burger King"};

        final MinimumIndexSumOfTwoLists solution = new MinimumIndexSumOfTwoLists();
        final String[] output = solution.findRestaurant(andy, doris);

        Assert.assertArrayEquals(new String[]{"Shogun"}, output);
    }
}
