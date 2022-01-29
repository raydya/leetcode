package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DecompressRunLengthEncodedListTest {
    @Test
    public void test1() {
        final DecompressRunLengthEncodedList solution = new DecompressRunLengthEncodedList();
        final int[] output = solution.decompressRLElist(new int[]{1, 2, 3, 4});

        Assert.assertArrayEquals(new int[]{2, 4, 4, 4}, output);
    }

    @Test
    public void test2() {
        final DecompressRunLengthEncodedList solution = new DecompressRunLengthEncodedList();
        final int[] output = solution.decompressRLElist(new int[]{1, 1, 2, 3});

        Assert.assertArrayEquals(new int[]{1, 3, 3}, output);
    }
}
