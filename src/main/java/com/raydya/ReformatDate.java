package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    private static final Map<String, String> month = new HashMap<String, String>() {
        {
            put("Jan", "01");
            put("Feb", "02");
            put("Mar", "03");
            put("Apr", "04");
            put("May", "05");
            put("Jun", "06");
            put("Jul", "07");
            put("Aug", "08");
            put("Sep", "09");
            put("Oct", "10");
            put("Nov", "11");
            put("Dec", "12");
        }
    };

    public String reformatDate(String date) {
        final String[] parts = date.split(" ");
        final String ds = parts[0];
        final StringBuilder dayStringBuilder = new StringBuilder();
        for (int i = 0; i < ds.length(); i++) {
            final char c = ds.charAt(i);
            if (Character.isDigit(c)) {
                dayStringBuilder.append(c);
            }
        }
        if (dayStringBuilder.length() < 2) {
            dayStringBuilder.insert(0, '0');
        }
        String day = dayStringBuilder.toString();

        StringBuilder ret = new StringBuilder();
        ret.append(parts[2]);
        ret.append('-');
        final String m = month.get(parts[1]);
        ret.append(m);
        ret.append('-');
        ret.append(day);

        return ret.toString();
    }

}
