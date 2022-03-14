package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {
        final Set<String> uniqueEmails = new HashSet<>();
        for (final String email : emails) {
            final String s = formatEmail(email);
            uniqueEmails.add(s);
        }

        return uniqueEmails.size();
    }

    private String formatEmail(String email) {
        StringBuilder ret = new StringBuilder();

        boolean afterPlus = false;

        int k = 0;
        for (int i = 0; i < email.length(); i++) {
            final char c = email.charAt(i);
            if (c == '@') {
                k = i;
                break;
            }

            if (c == '.') {
                continue;
            }

            if (c == '+' || afterPlus) {
                afterPlus = true;
                continue;
            }

            ret.append(c);
        }

        ret.append(email.substring(k));

        return ret.toString();
    }
}
