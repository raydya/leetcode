package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheArrayConcatenationValueTest {

    @Test
    public void test1() {
        final FindTheArrayConcatenationValue solution = new FindTheArrayConcatenationValue();
        final long output = solution.findTheArrayConcVal(new int[]{7, 52, 2, 4});

        Assert.assertEquals(596, output);
    }

    @Test
    public void test2() {
        final FindTheArrayConcatenationValue solution = new FindTheArrayConcatenationValue();
        final long output = solution.findTheArrayConcVal(new int[]{5, 14, 13, 8, 12});

        Assert.assertEquals(673, output);
    }
}
