package com.raydya;

public class ConvertANumberToHexadecimal {

    private static final String[] HEX_TABLE = new String[]{
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"
    };

    public String toHex(int num) {
        final String s = Integer.toBinaryString(num);

        StringBuilder n = new StringBuilder();

        int index = s.length();

        while (index > 0) {
            final String substring = s.substring(Math.max(index - 4, 0), index);

            int total = 0;
            int p = 0;

            for (int i = substring.length() - 1; i >= 0; i--) {
                final char c = substring.charAt(i);
                total += charToInt(c, p);
                p++;
            }

            n.append(HEX_TABLE[total]);
            index -= 4;
        }

        return n.reverse().toString();
    }

    private int charToInt(char c, int p) {
        if (c == '0') {
            return 0;
        }
        return (int) Math.pow(2, p);
    }
}
