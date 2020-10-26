package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SummaryRangesTest {
    @Test
    public void test1() {
        final SummaryRanges solution = new SummaryRanges();
        final List<String> ranges = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

        Assert.assertEquals("0->2", ranges.get(0));
        Assert.assertEquals("4->5", ranges.get(1));
        Assert.assertEquals("7", ranges.get(2));
    }

    @Test
    public void test2() {
        final SummaryRanges solution = new SummaryRanges();
        final List<String> ranges = solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});

        Assert.assertEquals("0", ranges.get(0));
        Assert.assertEquals("2->4", ranges.get(1));
        Assert.assertEquals("6", ranges.get(2));
        Assert.assertEquals("8->9", ranges.get(3));
    }

    @Test
    public void test3() {
        final SummaryRanges solution = new SummaryRanges();
        final List<String> ranges = solution.summaryRanges(new int[]{});

        Assert.assertEquals(0, ranges.size());
    }

    @Test
    public void test4() {
        final SummaryRanges solution = new SummaryRanges();
        final List<String> ranges = solution.summaryRanges(new int[]{-1});

        Assert.assertEquals("-1", ranges.get(0));
    }

    @Test
    public void test5() {
        final SummaryRanges solution = new SummaryRanges();
        final List<String> ranges = solution.summaryRanges(new int[]{0});

        Assert.assertEquals("0", ranges.get(0));
    }
}
