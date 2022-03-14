package com.raydya;

public class MyHashMap {

    private final Integer[] holder;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        this.holder = new Integer[1000001];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        this.holder[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
     * for the key
     */
    public int get(int key) {
        return this.holder[key] == null ? -1 : this.holder[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        this.holder[key] = -1;
    }
}
