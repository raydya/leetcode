package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void test1() {
        final MyHashMap obj = new MyHashMap();
        obj.put(1, 1);
        obj.put(2, 2);
        Assert.assertEquals(1, obj.get(1));
        Assert.assertEquals(-1, obj.get(3));
        obj.put(2, 1);
        Assert.assertEquals(1, obj.get(2));
        obj.remove(2);
        Assert.assertEquals(-1, obj.get(2));
    }
}
