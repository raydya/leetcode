package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ProjectAreaOf3DShapesTest {

    @Test
    public void test1() {
        final ProjectAreaOf3DShapes solution = new ProjectAreaOf3DShapes();
        final int output = solution.projectionArea(new int[][]{{2}});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final ProjectAreaOf3DShapes solution = new ProjectAreaOf3DShapes();
        final int output = solution.projectionArea(new int[][]{{1, 2}, {3, 4}});

        Assert.assertEquals(17, output);
    }

    @Test
    public void test3() {
        final ProjectAreaOf3DShapes solution = new ProjectAreaOf3DShapes();
        final int output = solution.projectionArea(new int[][]{{1, 0}, {0, 2}});

        Assert.assertEquals(8, output);
    }

    @Test
    public void test4() {
        final ProjectAreaOf3DShapes solution = new ProjectAreaOf3DShapes();
        final int output = solution.projectionArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});

        Assert.assertEquals(14, output);
    }

    @Test
    public void test5() {
        final ProjectAreaOf3DShapes solution = new ProjectAreaOf3DShapes();
        final int output = solution.projectionArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}});

        Assert.assertEquals(21, output);
    }
}
