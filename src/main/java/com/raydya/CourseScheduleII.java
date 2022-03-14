package com.raydya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses];
        final List<List<Integer>> edges = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }

        for (final int[] prerequisite : prerequisites) {
            final int a = prerequisite[0];
            final int b = prerequisite[1];
            inDegrees[a]++;
            edges.get(b).add(a);
        }

        final Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        final int[] result = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            final Integer u = queue.poll();
            result[index++] = u;
            for (final Integer r : edges.get(u)) {
                inDegrees[r]--;
                if (inDegrees[r] == 0) {
                    queue.offer(r);
                }
            }
        }

        if (index != numCourses) {
            return new int[0];
        }
        return result;
    }
}
