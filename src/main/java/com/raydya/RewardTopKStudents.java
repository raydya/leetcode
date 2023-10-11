package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RewardTopKStudents {

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report,
        int[] student_id, int k) {

        final Map<String, Integer> wordMap = new HashMap<>();
        final int[][] students = new int[student_id.length][2];

        for (final String pf : positive_feedback) {
            wordMap.put(pf, 3);
        }

        for (final String nf : negative_feedback) {
            wordMap.put(nf, -1);
        }

        for (int i = 0; i < report.length; i++) {
            final String s = report[i];
            final String[] words = s.split(" ");
            int score = 0;
            for (final String word : words) {
                score += wordMap.getOrDefault(word, 0);
            }
            students[i][0] = student_id[i];
            students[i][1] = score;
        }

        Arrays.sort(students, (o1, o2) -> {
            final int score1 = o1[1];
            final int score2 = o2[1];
            if (score1 == score2) {
                return o1[0] - o2[0];
            }
            return score2 - score1;
        });

        final List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ret.add(students[i][0]);
        }

        return ret;
    }
}
