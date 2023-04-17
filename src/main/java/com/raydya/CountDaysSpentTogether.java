package com.raydya;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountDaysSpentTogether {

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String year = "2023";
        final LocalDate aa = LocalDate.parse(year + "-" + arriveAlice);
        final LocalDate la = LocalDate.parse(year + "-" + leaveAlice);
        final LocalDate ab = LocalDate.parse(year + "-" + arriveBob);
        final LocalDate lb = LocalDate.parse(year + "-" + leaveBob);

        //求出Alice和Bob的时间段的交集
        LocalDate start = aa.isAfter(ab) ? aa : ab;
        LocalDate end = la.isBefore(lb) ? la : lb;

        //如果交集为空，返回0
        if (start.isAfter(end)) {
            return 0;
        }

        //否则，返回交集的天数
        long days = start.until(end, ChronoUnit.DAYS) + 1;
        return (int) days;
    }
}
