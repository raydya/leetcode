package com.raydya;

import com.raydya.RangeSumQueryMutable.NumArray;
import org.junit.Assert;
import org.junit.Test;

public class RangeSumQueryMutableTest {

    @Test
    public void test1() {
        final NumArray solution = new NumArray(new int[]{1, 3, 5});
        final int o1 = solution.sumRange(0, 2);
        Assert.assertEquals(9, o1);

        solution.update(1, 2);
        final int o2 = solution.sumRange(0, 2);
        Assert.assertEquals(8, o2);
    }

}
