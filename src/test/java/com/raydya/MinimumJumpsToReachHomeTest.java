package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumJumpsToReachHomeTest {

    @Test
    public void test1() {
        final MinimumJumpsToReachHome solution = new MinimumJumpsToReachHome();
        final int output = solution.minimumJumps(new int[]{14, 4, 18, 1, 15}, 3, 15, 9);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumJumpsToReachHome solution = new MinimumJumpsToReachHome();
        final int output = solution.minimumJumps(new int[]{8, 3, 16, 6, 12, 20}, 15, 13, 11);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final MinimumJumpsToReachHome solution = new MinimumJumpsToReachHome();
        final int output = solution.minimumJumps(new int[]{1, 6, 2, 14, 5, 17, 4}, 16, 9, 7);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final MinimumJumpsToReachHome solution = new MinimumJumpsToReachHome();
        final int output = solution.minimumJumps(
            new int[]{162, 118, 178, 152, 167, 100, 40, 74, 199, 186, 26, 73, 200, 127, 30, 124, 193, 84, 184, 36, 103,
                149, 153, 9, 54, 154, 133, 95, 45, 198, 79, 157, 64, 122, 59, 71, 48, 177, 82, 35, 14, 176, 16, 108,
                111, 6, 168, 31, 134, 164, 136, 72, 98},
            29, 98, 80);

        Assert.assertEquals(121, output);
    }

    @Test
    public void test5() {
        final MinimumJumpsToReachHome solution = new MinimumJumpsToReachHome();
        final int output = solution.minimumJumps(new int[]{128, 178, 147, 165, 63, 11, 150, 20, 158, 144, 136}, 61, 170,
            135);

        Assert.assertEquals(6, output);
    }
}
