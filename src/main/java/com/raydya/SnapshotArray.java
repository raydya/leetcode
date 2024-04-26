package com.raydya;

import java.util.HashMap;
import java.util.TreeMap;

public class SnapshotArray {

    private HashMap<Integer, TreeMap<Integer, Integer>> array;
    private int snapId;

    public SnapshotArray(int length) {
        this.array = new HashMap<>();
        this.snapId = 0;
        for (int i = 0; i < length; i++) {
            array.put(i, new TreeMap<>());
        }
    }

    public void set(int index, int val) {
        array.get(index).put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> map = array.get(index);
        final Integer k = map.floorKey(snap_id);
        if (k != null) {
            return map.get(k);
        }
        return 0;
    }
}
