package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetermineIfTwoEventsHaveConflictTest {

    @Test
    public void test1() {
        final DetermineIfTwoEventsHaveConflict solution = new DetermineIfTwoEventsHaveConflict();
        final boolean output = solution.haveConflict(
            new String[]{"01:15", "02:00"},
            new String[]{"02:00", "03:00"}
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DetermineIfTwoEventsHaveConflict solution = new DetermineIfTwoEventsHaveConflict();
        final boolean output = solution.haveConflict(
            new String[]{"01:00", "02:00"},
            new String[]{"01:20", "03:00"}
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final DetermineIfTwoEventsHaveConflict solution = new DetermineIfTwoEventsHaveConflict();
        final boolean output = solution.haveConflict(
            new String[]{"10:00", "11:00"},
            new String[]{"14:00", "15:00"}
        );

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final DetermineIfTwoEventsHaveConflict solution = new DetermineIfTwoEventsHaveConflict();
        final boolean output = solution.haveConflict(
            new String[]{"14:13", "22:08"},
            new String[]{"02:40", "08:08"}
        );

        Assert.assertFalse(output);
    }
}
