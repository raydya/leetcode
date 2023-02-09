package com.raydya;

public class CrawlerLogFolder {

    public int minOperations(String[] logs) {
        int c = 0;

        for (final String log : logs) {
            switch (log) {
                case "../":
                    c = Math.max(0, c - 1);
                    break;
                case "./":
                    break;
                default:
                    c++;
                    break;
            }
        }

        return c;
    }

}
