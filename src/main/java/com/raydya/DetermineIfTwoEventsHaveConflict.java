package com.raydya;

public class DetermineIfTwoEventsHaveConflict {

    public boolean haveConflict(String[] event1, String[] event2) {
        // 将时间字符串转换为分钟数
        int start1 = timeToMinutes(event1[0]);
        int end1 = timeToMinutes(event1[1]);
        int start2 = timeToMinutes(event2[0]);
        int end2 = timeToMinutes(event2[1]);

        // 检查是否存在冲突
        return !(end1 < start2 || end2 < start1);
    }

    private static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
