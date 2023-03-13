package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumHoursOfTrainingToWinACompetitionTest {

    @Test
    public void test1() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            5, 3,
            new int[]{1, 4, 3, 2},
            new int[]{2, 6, 3, 1}
        );

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            2, 4,
            new int[]{1},
            new int[]{3}
        );

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            30, 78,
            new int[]{24, 91, 63, 38, 31, 63, 22, 35, 91, 54, 88, 46, 80, 14, 12, 19, 57, 92},
            new int[]{18, 43, 36, 88, 84, 21, 82, 54, 61, 80, 68, 54, 75, 27, 99, 14, 86, 95}
        );

        Assert.assertEquals(891, output);
    }

    @Test
    public void test4() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            94, 70,
            new int[]{58, 47, 100, 71, 47, 6, 92, 82, 35, 16, 50, 15, 42, 5, 2, 45, 22},
            new int[]{77, 83, 99, 76, 75, 66, 58, 84, 44, 98, 70, 41, 48, 7, 10, 61, 28}
        );

        Assert.assertEquals(650, output);
    }

    @Test
    public void test5() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            1, 1,
            new int[]{1, 1, 1, 1}, //4
            new int[]{1, 1, 1, 50} //
        );

        Assert.assertEquals(51, output);
    }

    @Test
    public void test6() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            5, 3,
            new int[]{1, 4},
            new int[]{2, 5}
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test7() {
        final MinimumHoursOfTrainingToWinACompetition solution = new MinimumHoursOfTrainingToWinACompetition();
        final int output = solution.minNumberOfHours(
            11,
            23,
            new int[]{69, 22, 93, 68, 57, 76, 54, 72, 8, 78, 88, 15, 58, 61, 25, 70, 58, 91, 79, 22, 91, 74, 90, 75, 31,
                53, 31, 7, 51, 96, 76, 17, 64, 89, 83, 54, 28, 33, 32, 45, 20},
            new int[]{51, 81, 46, 80, 56, 7, 46, 74, 64, 20, 84, 66, 13, 91, 49, 30, 75, 43, 74, 88, 82, 51, 72, 4, 80,
                30, 10, 19, 40, 27, 21, 71, 24, 94, 79, 13, 40, 28, 63, 85, 70}
        );

        Assert.assertEquals(2323, output);
    }
}
