package com.raydya;

public class NumberOfDaysBetweenTwoDates {

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(f(date1) - f(date2));
    }

    private int f(String date) {
        final String[] s = date.split("-");
        final int y = Integer.parseInt(s[0]);
        final int m = Integer.parseInt(s[1]);
        final int d = Integer.parseInt(s[2]);

        int days = 0;
        for (int i = 1970; i < y; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        days += getYearDays(d, m, y);

        return days;
    }

    private int getYearDays(int day, int month, int year) {
        final int[] monthDays = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334,
            365};

        int ret = monthDays[month - 1] + day;

        if (isLeapYear(year) && month > 2) {
            ret += 1;
        }

        return ret;
    }

    /**
     * 闰年计算 普通闰年：公历年份是4的倍数，且不是100的倍数的，为闰年（如2004年、2020年等就是闰年）。 世纪闰年：公历年份是整百数的，必须是400的倍数才是闰年（如1900年不是闰年，2000年是闰年）。
     */
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }
}
