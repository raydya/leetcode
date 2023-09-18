package com.raydya;

public class TimeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int max = 0;
        for (final int ticket : tickets) {
            max = Math.max(max, ticket);
        }

        int c = 0;
        for (int i = 0; i < max; i++) {
            boolean e = false;
            for (int j = 0; j < tickets.length; j++) {
                if (tickets[j] > 0) {
                    tickets[j]--;
                    c++;
                }
                if (j == k && tickets[j] == 0) {
                    e = true;
                    break;
                }
            }
            if (e) {
                break;
            }
        }

        return c;
    }

}
