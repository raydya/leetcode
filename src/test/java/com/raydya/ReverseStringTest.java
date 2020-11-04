package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void test1() {
        final char[] chars = {'h', 'e', 'l', 'l', 'o'};

        final ReverseString solution = new ReverseString();
        solution.reverseString(chars);

        Assert.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, chars);
    }

    @Test
    public void test2() {
        final char[] chars = {'H', 'a', 'n', 'n', 'a', 'h'};

        final ReverseString solution = new ReverseString();
        solution.reverseString(chars);

        Assert.assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, chars);
    }

    @Test
    public void test3() {
        final char[] chars = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};

        final ReverseString solution = new ReverseString();
        solution.reverseString(chars);

        Assert.assertArrayEquals(new char[]{'a', 'm', 'a', 'n', 'a', 'P', ' ', ':', 'l', 'a', 'n', 'a', 'c', ' ', 'a', ' ', ',', 'n', 'a', 'l', 'p', ' ', 'a', ' ', ',', 'n', 'a', 'm', ' ', 'A'}, chars);
    }
}
