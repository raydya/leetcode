package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RecentCounterTest {

    @Test
    public void test1() {
        final RecentCounter recentCounter = new RecentCounter();
        Assert.assertEquals(1, recentCounter.ping(1));
        Assert.assertEquals(2, recentCounter.ping(100));
        Assert.assertEquals(3, recentCounter.ping(3001));
        Assert.assertEquals(3, recentCounter.ping(3002));
    }
}
