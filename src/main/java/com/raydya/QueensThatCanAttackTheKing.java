package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class QueensThatCanAttackTheKing {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        final List<List<Integer>> res = new ArrayList<>();
        final int x = king[0];
        final int y = king[1];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (final int[] queen : queens) {
            final int qx = queen[0];
            final int qy = queen[1];
            final Set<Integer> set = map.getOrDefault(qx, new HashSet<>());
            set.add(qy);
            map.put(qx, set);
        }
        // left
        for (int i = y - 1; i >= 0; i--) {
            if (isQueen(x, i, map)) {
                res.add(Arrays.asList(x, i));
                break;
            }
        }

        // right
        for (int i = y + 1; i < 8; i++) {
            if (isQueen(x, i, map)) {
                res.add(Arrays.asList(x, i));
                break;
            }
        }

        // top
        for (int i = x - 1; i >= 0; i--) {
            if (isQueen(i, y, map)) {
                res.add(Arrays.asList(i, y));
                break;
            }
        }

        // bottom
        for (int i = x + 1; i < 8; i++) {
            if (isQueen(i, y, map)) {
                res.add(Arrays.asList(i, y));
                break;
            }
        }

        final List<Integer> slash1 = slashMove(x, y, map, -1, -1);
        if (!slash1.isEmpty()) {
            res.add(slash1);
        }

        final List<Integer> slash2 = slashMove(x, y, map, 1, -1);
        if (!slash2.isEmpty()) {
            res.add(slash2);
        }

        final List<Integer> slash3 = slashMove(x, y, map, -1, 1);
        if (!slash3.isEmpty()) {
            res.add(slash3);
        }

        final List<Integer> slash4 = slashMove(x, y, map, 1, 1);
        if (!slash4.isEmpty()) {
            res.add(slash4);
        }

        return res;
    }

    private List<Integer> slashMove(int x, int y, Map<Integer, Set<Integer>> queens, int dx, int dy) {
        final List<Integer> res = new ArrayList<>();
        while (x >= 0 && x < 8 && y >= 0 && y < 8) {
            if (isQueen(x, y, queens)) {
                res.add(x);
                res.add(y);
                break;
            }
            x += dx;
            y += dy;
        }
        return res;
    }

    private boolean isQueen(int x, int y, Map<Integer, Set<Integer>> queens) {
        final Set<Integer> set = queens.get(x);
        return Objects.nonNull(set) && set.contains(y);
    }

}
