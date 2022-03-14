package com.raydya;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FindAllNumberDisappearedInAnArrayTest {

    @Test
    public void test1() {
        final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
        final List<Integer> disappearedNumbers = solution.findDisappearedNumbers(
            new int[]{4, 3, 2, 7, 8, 2, 3, 1});

        Assert.assertArrayEquals(Arrays.asList(5, 6).toArray(), disappearedNumbers.toArray());
    }

    @Test
    public void test2() {
        final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
        final List<Integer> disappearedNumbers = solution.findDisappearedNumbers(new int[]{});

        Assert.assertArrayEquals(Collections.emptyList().toArray(), disappearedNumbers.toArray());
    }

    @Test
    public void test3() {
        final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
        final List<Integer> disappearedNumbers = solution.findDisappearedNumbers(new int[]{1, 1});

        Assert.assertArrayEquals(Collections.singletonList(2).toArray(),
            disappearedNumbers.toArray());
    }

    @Test
    public void test4() {
        final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
        final List<Integer> disappearedNumbers = solution.findDisappearedNumbers(
            new int[]{1, 1, 2, 2});

        Assert.assertArrayEquals(Arrays.asList(3, 4).toArray(), disappearedNumbers.toArray());
    }

    @Test
    public void test5() {
        final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
        final List<Integer> disappearedNumbers = solution.findDisappearedNumbers(
            new int[]{5, 4, 6, 7, 9, 3, 10, 9, 5, 6});

        Assert.assertArrayEquals(Arrays.asList(1, 2, 8).toArray(), disappearedNumbers.toArray());
    }
}
