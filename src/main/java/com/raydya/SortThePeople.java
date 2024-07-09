package com.raydya;

import java.util.Arrays;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        final int n = names.length;
        final String[] ans = new String[n];

        final int[][] people = new int[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = heights[i];
            people[i][1] = i;
        }

        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });

        for (int i = 0; i < n; i++) {
            ans[i] = names[people[i][1]];
        }

        return ans;
    }

}
