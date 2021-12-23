package com.raydya;

public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        final char[] chars = new char[address.length() + 6];
        int j = 0;
        for (int i = 0; i < address.length(); i++) {
            final char c = address.charAt(i);
            if (c == '.') {
                chars[j] = '[';
                chars[j + 1] = '.';
                chars[j + 2] = ']';
                j += 3;
            } else {
                chars[j] = c;
                j++;
            }
        }

        return String.valueOf(chars);
    }
}
