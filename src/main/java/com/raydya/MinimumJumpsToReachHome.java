package com.raydya;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class MinimumJumpsToReachHome {

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Queue<int[]> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(new int[]{0, 1, 0});
        visited.add(0);
        int lower = 0;
        int upper = Math.max(Arrays.stream(forbidden).max().getAsInt() + a, x) + b;
        Set<Integer> forbiddenSet = new HashSet<>();
        for (int position : forbidden) {
            forbiddenSet.add(position);
        }
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int position = arr[0], direction = arr[1], step = arr[2];
            if (position == x) {
                return step;
            }
            int nextPosition = position + a;
            int nextDirection = 1;
            if (lower <= nextPosition && nextPosition <= upper && !visited.contains(nextPosition * nextDirection)
                && !forbiddenSet.contains(nextPosition)) {
                visited.add(nextPosition * nextDirection);
                queue.offer(new int[]{nextPosition, nextDirection, step + 1});
            }
            if (direction == 1) {
                nextPosition = position - b;
                nextDirection = -1;
                if (lower <= nextPosition && nextPosition <= upper && !visited.contains(nextPosition * nextDirection)
                    && !forbiddenSet.contains(nextPosition)) {
                    visited.add(nextPosition * nextDirection);
                    queue.offer(new int[]{nextPosition, nextDirection, step + 1});
                }
            }
        }
        return -1;
    }

}
