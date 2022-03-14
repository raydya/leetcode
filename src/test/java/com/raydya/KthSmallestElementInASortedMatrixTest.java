package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KthSmallestElementInASortedMatrixTest {

    @Test
    public void test1() {
        final int[][] matrix = {new int[]{1, 5, 9}, new int[]{10, 11, 13}, new int[]{12, 13, 15}};

        final KthSmallestElementInASortedMatrix solution = new KthSmallestElementInASortedMatrix();
        final int output = solution.kthSmallest(matrix, 8);

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final int[][] matrix = {new int[]{-5}};

        final KthSmallestElementInASortedMatrix solution = new KthSmallestElementInASortedMatrix();
        final int output = solution.kthSmallest(matrix, 1);

        Assert.assertEquals(-5, output);
    }


    @Test
    public void test3() {
        final int[][] matrix = {new int[]{1, 2}, new int[]{1, 3}};

        final KthSmallestElementInASortedMatrix solution = new KthSmallestElementInASortedMatrix();
        final int output = solution.kthSmallest(matrix, 2);

        Assert.assertEquals(1, output);
    }
}
