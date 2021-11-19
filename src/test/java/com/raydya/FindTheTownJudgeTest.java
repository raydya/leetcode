package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheTownJudgeTest {
    @Test
    public void test1() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(2, new int[][]{{1, 2}});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(3, new int[][]{{1, 3}, {2, 3}});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(3, new int[][]{{1, 2}, {2, 3}});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test5() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test6() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(1, new int[][]{});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test7() {
        final FindTheTownJudge solution = new FindTheTownJudge();
        final int output = solution.findJudge(2, new int[][]{});

        Assert.assertEquals(-1, output);
    }
}
