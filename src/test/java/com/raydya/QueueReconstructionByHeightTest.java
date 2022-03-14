package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class QueueReconstructionByHeightTest {

    @Test
    public void test1() {
        final int[][] input = {
            {7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}
        };

        final QueueReconstructionByHeight solution = new QueueReconstructionByHeight();
        final int[][] output = solution.reconstructQueue(input);

        Assert.assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {6, 1}, {7, 1}, {4, 4}}, output);
    }

    @Test
    public void test2() {
        final int[][] input = {
            {6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}
        };

        final QueueReconstructionByHeight solution = new QueueReconstructionByHeight();
        final int[][] output = solution.reconstructQueue(input);

        Assert.assertArrayEquals(new int[][]{{4, 0}, {5, 0}, {2, 2}, {3, 2}, {6, 0}}, output);
    }
}
