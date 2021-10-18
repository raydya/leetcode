package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SurfaceAreaOf3DShapesTest {
    @Test
    public void test1() {
        final SurfaceAreaOf3DShapes solution = new SurfaceAreaOf3DShapes();
        final int output = solution.surfaceArea(new int[][]{
            new int[]{2}
        });

        Assert.assertEquals(10, output);
    }

    @Test
    public void test2() {
        final SurfaceAreaOf3DShapes solution = new SurfaceAreaOf3DShapes();
        final int output = solution.surfaceArea(new int[][]{
            new int[]{1, 2},
            new int[]{3, 4}
        });

        Assert.assertEquals(34, output);
    }

    @Test
    public void test3() {
        final SurfaceAreaOf3DShapes solution = new SurfaceAreaOf3DShapes();
        final int output = solution.surfaceArea(new int[][]{
            new int[]{1, 0},
            new int[]{0, 2}
        });

        Assert.assertEquals(16, output);
    }

    @Test
    public void test4() {
        final SurfaceAreaOf3DShapes solution = new SurfaceAreaOf3DShapes();
        final int output = solution.surfaceArea(new int[][]{
            new int[]{1, 1, 1},
            new int[]{1, 0, 1},
            new int[]{1, 1, 1},
        });

        Assert.assertEquals(32, output);
    }

    @Test
    public void test5() {
        final SurfaceAreaOf3DShapes solution = new SurfaceAreaOf3DShapes();
        final int output = solution.surfaceArea(new int[][]{
            new int[]{2, 2, 2},
            new int[]{2, 1, 2},
            new int[]{2, 2, 2},
        });

        Assert.assertEquals(46, output);
    }
}
