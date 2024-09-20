package com.raydya.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ClimbingTheLeaderBoard {

    public List<Integer> climbingLeaderBoard(List<Integer> ranked, List<Integer> player) {
        List<Integer> res = new ArrayList<>();
        TreeSet<Integer> uniqueRanked = new TreeSet<>(ranked);
        List<Integer> sortedRanked = new ArrayList<>(uniqueRanked);
        Collections.reverse(sortedRanked);

        int index = sortedRanked.size() - 1;

        for (int score : player) {
            while (index >= 0 && score >= sortedRanked.get(index)) {
                index--;
            }
            res.add(index + 2);
        }

        return res;
    }
}
