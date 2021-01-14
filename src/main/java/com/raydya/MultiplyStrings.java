package com.raydya;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        final int m = num1.length();
        final int n = num2.length();

        final int[] holder = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                final int v1 = num1.charAt(i) - '0';
                final int v2 = num2.charAt(j) - '0';

                final int v = v1 * v2;

                final int p1 = i + j;
                final int p2 = i + j + 1;
                final int sum = v + holder[p2];

                holder[p1] += sum / 10;
                holder[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int h : holder) {
            if (!(sb.length() == 0 && h == 0)) {
                sb.append(h);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
