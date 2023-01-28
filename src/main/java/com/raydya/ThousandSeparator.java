package com.raydya;

public class ThousandSeparator {

    public String thousandSeparator(int n) {
        final String s = String.valueOf(n);

        final StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (cnt == 3) {
                cnt = 0;
                sb.insert(0, ".");
            }
            sb.insert(0, s.charAt(i));
            cnt++;
        }

        return sb.toString();
    }

}
