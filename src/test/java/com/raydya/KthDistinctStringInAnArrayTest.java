package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KthDistinctStringInAnArrayTest {

    @Test
    public void test1() {
        final KthDistinctStringInAnArray solution = new KthDistinctStringInAnArray();
        final String output = solution.kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2);

        Assert.assertEquals("a", output);
    }

    @Test
    public void test2() {
        final KthDistinctStringInAnArray solution = new KthDistinctStringInAnArray();
        final String output = solution.kthDistinct(new String[]{"aaa", "aa", "a"}, 1);

        Assert.assertEquals("aaa", output);
    }

    @Test
    public void test3() {
        final KthDistinctStringInAnArray solution = new KthDistinctStringInAnArray();
        final String output = solution.kthDistinct(new String[]{"a", "b", "a"}, 3);

        Assert.assertEquals("", output);
    }
}
