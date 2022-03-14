package com.raydya;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void test1() {
        final List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );
        final Triangle solution = new Triangle();
        final int output = solution.minimumTotal(triangle);

        Assert.assertEquals(11, output);
    }

    @Test
    public void test2() {
        final List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(-10)
        );
        final Triangle solution = new Triangle();
        final int output = solution.minimumTotal(triangle);

        Assert.assertEquals(-10, output);
    }

    @Test
    public void test3() {
        final List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(-1),
            Arrays.asList(2, 3),
            Arrays.asList(1, -1, -3)
        );
        final Triangle solution = new Triangle();
        final int output = solution.minimumTotal(triangle);

        Assert.assertEquals(-1, output);
    }
}
