package com.raydya;

public class RingsAndRods {

    public int countPoints(String rings) {
        int cnt = 0;
        final int[] k = new int[10];
        final boolean[] visited = new boolean[10];
        for (int i = 0; i < rings.length(); i += 2) {
            final char color = rings.charAt(i);
            final int pos = rings.charAt(i + 1) - '0';
            k[pos] |= getColorBit(color);
            if (k[pos] == 7 && !visited[pos]) {
                cnt++;
                visited[pos] = true;
            }
        }

        return cnt;
    }

    public int getColorBit(char color) {
        switch (color) {
            case 'R':
                return 1;
            case 'G':
                return 2;
            case 'B':
                return 4;
            default:
                break;
        }

        return 0;
    }

}
