package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void test1() {
        final MajorityElement solution = new MajorityElement();
        final int majorityElement = solution.majorityElement(new int[]{3, 2, 3});

        Assert.assertEquals(3, majorityElement);
    }

    @Test
    public void test2() {
        final MajorityElement solution = new MajorityElement();
        final int majorityElement = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});

        Assert.assertEquals(2, majorityElement);
    }
}
