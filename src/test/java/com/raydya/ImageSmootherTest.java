package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ImageSmootherTest {

    @Test
    public void test1() {
        final ImageSmoother solution = new ImageSmoother();
        final int[][] output = solution.imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});

        Assert.assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, output);
    }


    @Test
    public void test2() {
        final ImageSmoother solution = new ImageSmoother();
        final int[][] output = solution.imageSmoother(
            new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}});

        Assert.assertArrayEquals(new int[][]{{137, 141, 137}, {141, 138, 141}, {137, 141, 137}},
            output);
    }
}
