package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestPerimeterTriangleTest {
    @Test
    public void test1() {
        final LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        final int output = solution.largestPerimeter(new int[]{2, 1, 2});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        final int output = solution.largestPerimeter(new int[]{1, 2, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        final int output = solution.largestPerimeter(new int[]{3, 2, 3, 4});

        Assert.assertEquals(10, output);
    }

    @Test
    public void test4() {
        final LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        final int output = solution.largestPerimeter(new int[]{3, 6, 2, 3});

        Assert.assertEquals(8, output);
    }

    @Test
    public void test5() {
        final LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        final int output = solution.largestPerimeter(new int[]{1, 2, 2, 4, 18, 8});

        Assert.assertEquals(5, output);
    }
}
