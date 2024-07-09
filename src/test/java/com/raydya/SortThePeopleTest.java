package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortThePeopleTest {

    @Test
    public void test1() {
        final SortThePeople solution = new SortThePeople();
        final String[] output = solution.sortPeople(
            new String[]{"Mary", "John", "Emma"},
            new int[]{180, 165, 170}
        );

        Assert.assertArrayEquals(new String[]{"Mary", "Emma", "John"}, output);
    }

    @Test
    public void test2() {
        final SortThePeople solution = new SortThePeople();
        final String[] output = solution.sortPeople(
            new String[]{"Alice", "Bob", "Bob"},
            new int[]{155, 185, 150}
        );

        Assert.assertArrayEquals(new String[]{"Bob", "Alice", "Bob"}, output);
    }
}
