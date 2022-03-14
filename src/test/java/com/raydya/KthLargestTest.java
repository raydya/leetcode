package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KthLargestTest {

    @Test
    public void test1() {
        final KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assert.assertEquals(4, kthLargest.add(3));
        Assert.assertEquals(5, kthLargest.add(5));
        Assert.assertEquals(5, kthLargest.add(10));
        Assert.assertEquals(8, kthLargest.add(9));
        Assert.assertEquals(8, kthLargest.add(4));
    }
}
