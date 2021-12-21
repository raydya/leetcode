package com.raydya;

public class DayOfTheYear {
    public int dayOfYear(String date) {
        final String[] s = date.split("-");
        final int year = Integer.parseInt(s[0]);
        final int month = Integer.parseInt(s[1]);
        final int day = Integer.parseInt(s[2]);

        final int[] mDays = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        if (year % 4 == 0 && month > 2) {
            return mDays[month - 1] + day + 1;
        }

        return mDays[month - 1] + day;
    }
}
