package com.raydya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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

        int visited = 0;
        while (!queue.isEmpty()) {
            ++visited;
            final Integer u = queue.poll();
            for (final Integer r : edges.get(u)) {
                inDegrees[r]--;
                if (inDegrees[r] == 0) {
                    queue.offer(r);
                }
            }
        }

        return visited == numCourses;
    }
}
