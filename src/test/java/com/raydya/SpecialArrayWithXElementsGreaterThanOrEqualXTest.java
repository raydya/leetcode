package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SpecialArrayWithXElementsGreaterThanOrEqualXTest {

    @Test
    public void test1() {
        final SpecialArrayWithXElementsGreaterThanOrEqualX solution = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        final int output = solution.specialArray(new int[]{3, 5});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final SpecialArrayWithXElementsGreaterThanOrEqualX solution = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        final int output = solution.specialArray(new int[]{0, 0});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final SpecialArrayWithXElementsGreaterThanOrEqualX solution = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        final int output = solution.specialArray(new int[]{0, 4, 3, 0, 4});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final SpecialArrayWithXElementsGreaterThanOrEqualX solution = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        final int output = solution.specialArray(new int[]{3, 6, 7, 7, 0});

        Assert.assertEquals(-1, output);
    }
}
