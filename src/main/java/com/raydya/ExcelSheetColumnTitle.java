package com.raydya;


public class ExcelSheetColumnTitle {

    private static final String[] MAPPING = new String[]{
        "A", "B", "C", "D", "E",
        "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O",
        "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y",
        "Z"
    };

    public String convertToTitle(int n) {
        if (n <= 26) {
            return MAPPING[n - 1];
        }

        int quotient = n / 26;
        int remain = n % 26;

        if (remain == 0) {
            final String remainStr = MAPPING[25];
            final String quotientStr = convertToTitle(quotient - 1);
            return quotientStr + remainStr;
        }

        final String quotientStr = convertToTitle(quotient);
        final String remainStr = MAPPING[remain - 1];
        return quotientStr + remainStr;
    }
}
