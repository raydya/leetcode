package com.raydya;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PascalsTriangleTest {

    @Test
    public void test1() {
        final PascalsTriangle solution = new PascalsTriangle();
        final List<List<Integer>> output = solution.generate(5);

        final List<List<Integer>> expected = Arrays.asList(
            Collections.singletonList(1),
            Arrays.asList(1, 1),
            Arrays.asList(1, 2, 1),
            Arrays.asList(1, 3, 3, 1),
            Arrays.asList(1, 4, 6, 4, 1)
        );

        Assert.assertEquals(expected, output);
    }
}
