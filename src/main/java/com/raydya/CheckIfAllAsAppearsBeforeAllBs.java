package com.raydya;

public class CheckIfAllAsAppearsBeforeAllBs {

    public boolean checkString(String s) {
        int la = -1;
        int fb = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == 'a') {
                la = Math.max(i, la);
            } else {
                fb = Math.min(i, fb);
            }

            if (la > fb) {
                return false;
            }
        }

        return la < fb;
    }

}
