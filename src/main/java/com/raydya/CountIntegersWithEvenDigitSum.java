package com.raydya;

public class CountIntegersWithEvenDigitSum {

    public int countEven(int num) {
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            final String s = String.valueOf(i);
            int n = 0;
            for (int j = 0; j < s.length(); j++) {
                final char k = s.charAt(j);
                n += k;
            }

            if (n % 2 == 0) {
                cnt++;
            }

        }

        return cnt;
    }

}
