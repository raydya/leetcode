package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StudentAttendanceRecordITest {
    @Test
    public void test1() {
        final StudentAttendanceRecordI solution = new StudentAttendanceRecordI();
        final boolean output = solution.checkRecord("PPALLP");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final StudentAttendanceRecordI solution = new StudentAttendanceRecordI();
        final boolean output = solution.checkRecord("PPALLL");

        Assert.assertFalse(output);
    }
}
