package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubarrayITest {

    @Test
    public void test1() {
        final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        final double output = solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);

        Assert.assertEquals(12.75, output, 0.00);
    }

    @Test
    public void test2() {
        final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        final double output = solution.findMaxAverage(new int[]{5}, 1);

        Assert.assertEquals(5.0, output, 0.0);
    }

    @Test
    public void test3() {
        final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        final double output = solution.findMaxAverage(new int[]{-1}, 1);

        Assert.assertEquals(-1.0, output, 0.0);
    }

    @Test
    public void test4() {
        final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        final double output = solution.findMaxAverage(new int[]{4, 0, 4, 3, 3}, 5);

        Assert.assertEquals(2.8, output, 0.0);
    }

    @Test
    public void test5() {
        final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        final double output = solution.findMaxAverage(new int[]{7, 4, 5, 8, 8, 3, 9, 8, 7, 6}, 7);

        Assert.assertEquals(7.0, output, 0.0);
    }

    @Test
    public void test6() {
        final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        final double output = solution.findMaxAverage(
            new int[]{-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284, -3024, 1714,
                -2825, -2374, -2750, -959, 6516, 9356, 8040, -2169, -9490, -3068, 6299, 7823, -9767,
                5751, -7897, 6680, -1293, -3486, -6785, 6337, -9158, -4183, 6240, -2846, -2588,
                -5458, -9576, -1501, -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636,
                -3994, -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880, 4127,
                -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591, 9076, 942,
                4571, -4200, 7271, -6920, -1886, 662, 7844, 3658, -6562, -2106, -296, -3280, 8909,
                -8352, -9413, 3513, 1352, -8825}, 90);

        Assert.assertEquals(37.25556, output, 0.00001);
    }
}
