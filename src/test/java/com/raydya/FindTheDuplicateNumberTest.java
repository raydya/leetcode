package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDuplicateNumberTest {

    @Test
    public void test1() {
        final FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        final int output = solution.findDuplicate(new int[]{1, 3, 4, 2, 2});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        final int output = solution.findDuplicate(new int[]{3, 1, 3, 4, 2});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        final int output = solution.findDuplicate(new int[]{1, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        final int output = solution.findDuplicate(new int[]{1, 1, 2});

        Assert.assertEquals(1, output);
    }
}
