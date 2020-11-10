package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSegmentsInAStringTest {
    @Test
    public void test1() {
        final NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        final int countSegments = solution.countSegments("Hello, my name is John");

        Assert.assertEquals(5, countSegments);
    }

    @Test
    public void test2() {
        final NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        final int countSegments = solution.countSegments("Hello");

        Assert.assertEquals(1, countSegments);
    }

    @Test
    public void test3() {
        final NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        final int countSegments = solution.countSegments("love live! mu'sic forever");

        Assert.assertEquals(4, countSegments);
    }

    @Test
    public void test4() {
        final NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        final int countSegments = solution.countSegments("");

        Assert.assertEquals(0, countSegments);
    }

    @Test
    public void test5() {
        final NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        final int countSegments = solution.countSegments(", , , ,        a, eaefa");

        Assert.assertEquals(6, countSegments);
    }
}
