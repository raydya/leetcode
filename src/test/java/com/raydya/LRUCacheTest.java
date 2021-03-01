package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {
    @Test
    public void test1() {
        final LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        final int o1 = lruCache.get(1);
        Assert.assertEquals(1, o1);
        lruCache.put(3, 3);
        final int o2 = lruCache.get(2);
        Assert.assertEquals(-1, o2);
        lruCache.put(4, 4);
        final int o3 = lruCache.get(1);
        Assert.assertEquals(-1, o3);
        final int o4 = lruCache.get(3);
        Assert.assertEquals(3, o4);
        final int o5 = lruCache.get(4);
        Assert.assertEquals(4, o5);
    }

    @Test
    public void test2() {
        final LRUCache lruCache = new LRUCache(2);
        final int o1 = lruCache.get(2);
        Assert.assertEquals(-1, o1);
        lruCache.put(2, 6);
        final int o2 = lruCache.get(1);
        Assert.assertEquals(-1, o2);
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        final int o3 = lruCache.get(1);
        Assert.assertEquals(2, o3);
        final int o4 = lruCache.get(2);
        Assert.assertEquals(6, o4);
    }

    @Test
    public void test3() {
        final LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        final int o1 = lruCache.get(1);
        Assert.assertEquals(-1, o1);
        final int o2 = lruCache.get(2);
        Assert.assertEquals(3, o2);
    }
}
