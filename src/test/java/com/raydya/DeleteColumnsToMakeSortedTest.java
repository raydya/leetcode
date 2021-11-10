package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DeleteColumnsToMakeSortedTest {
    @Test
    public void test1() {
        final DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();
        final int output = solution.minDeletionSize(new String[]{"cba", "daf", "ghi"});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();
        final int output = solution.minDeletionSize(new String[]{"a", "b"});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();
        final int output = solution.minDeletionSize(new String[]{"zyx", "wvu", "tsr"});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();
        final int output = solution.minDeletionSize(new String[]{"rrjk", "furt", "guzm"});

        Assert.assertEquals(2, output);
    }
}
