package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SelfDividingNumbersTest {
    @Test
    public void test1() {
        final SelfDividingNumbers solution = new SelfDividingNumbers();
        final List<Integer> output = solution.selfDividingNumbers(1, 22);

        Assert.assertArrayEquals(
            new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22},
            output.toArray()
        );
    }
}
