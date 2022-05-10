package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BuildAnArrayWithStackOperationsTest {

    @Test
    public void test1() {
        final BuildAnArrayWithStackOperations solution = new BuildAnArrayWithStackOperations();
        final List<String> output = solution.buildArray(new int[]{1, 3}, 3);

        Assert.assertArrayEquals(new String[]{"Push", "Push", "Pop", "Push"}, output.toArray());
    }

    @Test
    public void test2() {
        final BuildAnArrayWithStackOperations solution = new BuildAnArrayWithStackOperations();
        final List<String> output = solution.buildArray(new int[]{1, 2, 3}, 3);

        Assert.assertArrayEquals(new String[]{"Push", "Push", "Push"}, output.toArray());
    }

    @Test
    public void test3() {
        final BuildAnArrayWithStackOperations solution = new BuildAnArrayWithStackOperations();
        final List<String> output = solution.buildArray(new int[]{1, 2}, 4);

        Assert.assertArrayEquals(new String[]{"Push", "Push"}, output.toArray());
    }

}
