package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ReconstructA2RowBinaryMatrixTest {

    @Test
    public void test1() {
        final ReconstructA2RowBinaryMatrix solution = new ReconstructA2RowBinaryMatrix();
        final List<List<Integer>> output = solution.reconstructMatrix(2, 1, new int[]{1, 1, 1});

        final Integer[][] expects = {{1, 1, 0}, {0, 0, 1}};
        for (int i = 0; i < output.size(); i++) {
            final List<Integer> k = output.get(i);
            Assert.assertArrayEquals(expects[i], k.toArray());
        }
    }

    @Test
    public void test2() {
        final ReconstructA2RowBinaryMatrix solution = new ReconstructA2RowBinaryMatrix();
        final List<List<Integer>> output = solution.reconstructMatrix(2, 3, new int[]{2, 2, 1, 1});

        Assert.assertArrayEquals(new Integer[][]{}, output.toArray());
    }

    @Test
    public void test3() {
        final ReconstructA2RowBinaryMatrix solution = new ReconstructA2RowBinaryMatrix();
        final List<List<Integer>> output = solution.reconstructMatrix(5, 5, new int[]{2, 1, 2, 0, 1, 0, 1, 2, 0, 1});
        final Integer[][] expects = {
            {1, 1, 1, 0, 1, 0, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1}
        };

        for (int i = 0; i < output.size(); i++) {
            final List<Integer> k = output.get(i);
            Assert.assertArrayEquals(expects[i], k.toArray());
        }
    }

    @Test
    public void test4() {
        final ReconstructA2RowBinaryMatrix solution = new ReconstructA2RowBinaryMatrix();
        final List<List<Integer>> output = solution.reconstructMatrix(1, 4, new int[]{2, 1, 2, 0, 0, 2});

        Assert.assertArrayEquals(new Integer[][]{}, output.toArray());
    }

    @Test
    public void test5() {
        final ReconstructA2RowBinaryMatrix solution = new ReconstructA2RowBinaryMatrix();
        final List<List<Integer>> output = solution.reconstructMatrix(4, 7, new int[]{2, 1, 2, 2, 1, 1, 1});

        Assert.assertArrayEquals(new Integer[][]{}, output.toArray());
    }
}
