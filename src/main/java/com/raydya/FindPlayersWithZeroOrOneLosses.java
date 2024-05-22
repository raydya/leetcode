package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class FindPlayersWithZeroOrOneLosses {

    public List<List<Integer>> findWinners(int[][] matches) {
        int maxPlayerId = 0;
        for (int[] match : matches) {
            maxPlayerId = Math.max(maxPlayerId, Math.max(match[0], match[1]));
        }

        int[] wins = new int[maxPlayerId + 1];
        int[] losses = new int[maxPlayerId + 1];

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            wins[winner]++;
            losses[loser]++;
        }

        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();

        for (int i = 1; i <= maxPlayerId; i++) {
            if (wins[i] > 0 && losses[i] == 0) {
                winners.add(i);
            } else if (losses[i] == 1) {
                losers.add(i);
            }
        }

        List<List<Integer>> ret = new ArrayList<>();
        ret.add(winners);
        ret.add(losers);
        return ret;
    }

}
