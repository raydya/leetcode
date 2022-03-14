package com.raydya;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        intervals = Arrays.copyOf(intervals, intervals.length + 1);
        intervals[intervals.length - 1] = newInterval;

        Comparator<int[]> comp = Comparator.comparingInt(a -> a[0]);

        Arrays.sort(intervals, comp);

        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
