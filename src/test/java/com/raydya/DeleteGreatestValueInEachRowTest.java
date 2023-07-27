package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DeleteGreatestValueInEachRowTest {

    @Test
    public void test1() {
        final DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        final int output = solution.deleteGreatestValue(new int[][]{
            {1, 2, 4}, {3, 3, 1}
        });

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        final int output = solution.deleteGreatestValue(new int[][]{
            {10}
        });

        Assert.assertEquals(10, output);
    }
}
