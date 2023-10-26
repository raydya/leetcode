package com.raydya;

public class CountTheDigitsThatDivideANumber {

    public int countDigits(int num) {
        int cnt = 0;
        final String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            final int k = s.charAt(i) - '0';
            if (num % k == 0) {
                cnt++;
            }
        }

        return cnt;
    }

}
