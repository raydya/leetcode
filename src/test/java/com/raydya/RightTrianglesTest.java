package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RightTrianglesTest {

    @Test
    public void test1() {
        final RightTriangles solution = new RightTriangles();
        final long output = solution.numberOfRightTriangles(
            new int[][]{
                {0, 1, 0}, {0, 1, 1}, {0, 1, 0}
            }
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final RightTriangles solution = new RightTriangles();
        final long output = solution.numberOfRightTriangles(
            new int[][]{
                {1, 0, 0, 0}, {0, 1, 0, 1}, {1, 0, 0, 0}
            }
        );

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final RightTriangles solution = new RightTriangles();
        final long output = solution.numberOfRightTriangles(
            new int[][]{
                {1, 0, 1}, {1, 0, 0}, {1, 0, 0}
            }
        );

        Assert.assertEquals(2, output);
    }
}
