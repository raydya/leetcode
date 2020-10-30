package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FirstBadVersionTest {
    @Test
    public void test1() {
        final FirstBadVersion solution = new FirstBadVersion();
        final int firstBadVersion = solution.firstBadVersion(5);

        Assert.assertEquals(4, firstBadVersion);
    }

    @Test
    public void test2() {
        final FirstBadVersion solution = new FirstBadVersion();
        final int firstBadVersion = solution.firstBadVersion(1);

        Assert.assertEquals(1, firstBadVersion);
    }
}
