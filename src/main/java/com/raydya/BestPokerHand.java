package com.raydya;

public class BestPokerHand {

    private static final String FLUSH = "Flush";
    private static final String THREE_OF_A_KIND = "Three of a Kind";
    private static final String PAIR = "Pair";
    private static final String HIGH_CARD = "High Card";

    public String bestHand(int[] ranks, char[] suits) {
        final int[] rankCount = new int[14];
        final int[] suitCount = new int[4];
        int maxRank = 0;
        int maxSuit = 0;

        for (int i = 0; i < ranks.length; i++) {
            final int rank = ranks[i];
            final char suit = suits[i];
            final int suitIndex = suit - 'a';

            rankCount[rank]++;
            suitCount[suitIndex]++;

            maxRank = Math.max(maxRank, rankCount[rank]);
            maxSuit = Math.max(maxSuit, suitCount[suitIndex]);
        }

        if (maxSuit == 5) {
            return FLUSH;
        } else if (maxRank >= 3) {
            return THREE_OF_A_KIND;
        } else if (maxRank == 2) {
            return PAIR;
        }

        return HIGH_CARD;
    }

}
