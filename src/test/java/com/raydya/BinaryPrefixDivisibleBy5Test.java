package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BinaryPrefixDivisibleBy5Test {

    @Test
    public void test1() {
        final BinaryPrefixDivisibleBy5 solution = new BinaryPrefixDivisibleBy5();
        final List<Boolean> output = solution.prefixesDivBy5(new int[]{0, 1, 1});

        Assert.assertArrayEquals(new Boolean[]{true, false, false}, output.toArray());
    }

    @Test
    public void test2() {
        final BinaryPrefixDivisibleBy5 solution = new BinaryPrefixDivisibleBy5();
        final List<Boolean> output = solution.prefixesDivBy5(new int[]{1, 1, 1});

        Assert.assertArrayEquals(new Boolean[]{false, false, false}, output.toArray());
    }

    @Test
    public void test3() {
        final BinaryPrefixDivisibleBy5 solution = new BinaryPrefixDivisibleBy5();
        final List<Boolean> output = solution.prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1});

        Assert.assertArrayEquals(new Boolean[]{true, false, false, false, true, false},
            output.toArray());
    }

    @Test
    public void test4() {
        final BinaryPrefixDivisibleBy5 solution = new BinaryPrefixDivisibleBy5();
        final List<Boolean> output = solution.prefixesDivBy5(new int[]{1, 1, 1, 0, 1});

        Assert.assertArrayEquals(new Boolean[]{false, false, false, false, false},
            output.toArray());
    }

    @Test
    public void test5() {
        final BinaryPrefixDivisibleBy5 solution = new BinaryPrefixDivisibleBy5();
        final List<Boolean> output = solution.prefixesDivBy5(
            new int[]{
                1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1
            }
        );

        Assert.assertArrayEquals(
            new Boolean[]{
                false, false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, true, false, false, true, true,
                true,
                true, false
            },
            output.toArray()
        );
    }
}
