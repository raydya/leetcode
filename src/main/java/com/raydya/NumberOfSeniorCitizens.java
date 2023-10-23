package com.raydya;

public class NumberOfSeniorCitizens {

    public int countSeniors(String[] details) {
        int cnt = 0;
        for (final String detail : details) {
            final int i = detail.charAt(11) - '0';
            if (i > 6) {
                cnt++;
            } else if (i == 6) {
                final int j = detail.charAt(12) - '0';
                if (j != 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
