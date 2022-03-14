package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RangeSumQueryImmutableTest {

    @Test
    public void test1() {
        RangeSumQueryImmutable.NumArray numArray = new RangeSumQueryImmutable.NumArray(
            new int[]{-2, 0, 3, -5, 2, -1});
        final int i = numArray.sumRange(0, 2);

        Assert.assertEquals(1, i);

        final int i1 = numArray.sumRange(2, 5);
        Assert.assertEquals(-1, i1);

        final int i2 = numArray.sumRange(0, 5);
        Assert.assertEquals(-3, i2);
    }
}
