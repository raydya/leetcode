package com.raydya;

public class ReformatPhoneNumber {

    public String reformatNumber(String number) {
        final StringBuilder b = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            final char c = number.charAt(i);
            if (Character.isDigit(c)) {
                b.append(c);
            }
        }
        final String n = b.toString();
        int k = (n.length() / 3) * 3;
        final int l = n.length() % 3;
        if (l == 1) {
            k -= 3;
        }
        int cnt = 0;
        final StringBuilder nb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            cnt++;
            nb.append(n.charAt(i));
            if (cnt == 3) {
                nb.append('-');
                cnt = 0;
            }
        }

        if (l == 0) {
            nb.deleteCharAt(nb.length() - 1);
        }

        cnt = 0;
        for (int i = k; i < n.length(); i++) {
            cnt++;
            nb.append(n.charAt(i));
            if (cnt == 2 && i != n.length() - 1) {
                nb.append('-');
                cnt = 0;
            }
        }

        return nb.toString();
    }

}
