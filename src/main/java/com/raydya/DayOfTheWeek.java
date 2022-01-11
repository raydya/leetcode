package com.raydya;

public class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int t = 0;
        for (int i = 1971; i < year; i++) {
            if (isLeapYear(i)) {
                t += 366;
            } else {
                t += 365;
            }
        }

        final int yearDays = getYearDays(day, month, year);

        final int k = t + yearDays;

        final int d = (k + 4) % 7;

        return days[d];
    }

    private int getYearDays(int day, int month, int year) {
        final int[] monthDays = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        int ret = monthDays[month - 1] + day;

        if (isLeapYear(year) && month > 2) {
            ret += 1;
        }

        return ret;
    }

    /**
     * 闰年计算
     * 普通闰年：公历年份是4的倍数，且不是100的倍数的，为闰年（如2004年、2020年等就是闰年）。
     * 世纪闰年：公历年份是整百数的，必须是400的倍数才是闰年（如1900年不是闰年，2000年是闰年）。
     */
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }
}
