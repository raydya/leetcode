package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void test1() {
        final ReverseBits solution = new ReverseBits();
        final int reverseBits = solution.reverseBits(43261596);

        Assert.assertEquals(964176192, reverseBits);
    }

    @Test
    public void test2() {
        final ReverseBits solution = new ReverseBits();
        final int reverseBits = solution.reverseBits(-3);

        Assert.assertEquals(-1073741825, reverseBits);
    }

}
