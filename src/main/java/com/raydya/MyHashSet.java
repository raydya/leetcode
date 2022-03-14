package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class MyHashSet {

    private final Map<Integer, Boolean> map;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        this.map = new HashMap<>();
    }

    public void add(int key) {
        map.putIfAbsent(key, true);
    }

    public void remove(int key) {
        map.remove(key);
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}
