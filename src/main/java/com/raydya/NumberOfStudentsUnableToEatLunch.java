package com.raydya;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        final Queue<Integer> sq = new LinkedList<>();
        final Stack<Integer> wq = new Stack<>();

        for (int i = 0; i < students.length; i++) {
            sq.add(students[i]);
            wq.add(sandwiches[sandwiches.length - 1 - i]);
        }

        int c = 0;
        while (!wq.isEmpty()) {
            final Integer s = sq.poll();
            final Integer w = wq.pop();
            if (!Objects.equals(s, w)) {
                sq.add(s);
                wq.push(w);
                c++;
            } else {
                c = 0;
            }
            if (c > sq.size()) {
                break;
            }
        }

        return sq.size();
    }

}
