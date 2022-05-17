package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

    @Test
    public void test1() {
        final NumberOfStudentsDoingHomeworkAtAGivenTime solution = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        final int output = solution.busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final NumberOfStudentsDoingHomeworkAtAGivenTime solution = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        final int output = solution.busyStudent(new int[]{4}, new int[]{4}, 4);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final NumberOfStudentsDoingHomeworkAtAGivenTime solution = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        final int output = solution.busyStudent(new int[]{4}, new int[]{4}, 5);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final NumberOfStudentsDoingHomeworkAtAGivenTime solution = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        final int output = solution.busyStudent(new int[]{1, 1, 1, 1}, new int[]{1, 3, 2, 4}, 7);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final NumberOfStudentsDoingHomeworkAtAGivenTime solution = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        final int output = solution.busyStudent(
            new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1},
            new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10},
            5
        );

        Assert.assertEquals(5, output);
    }

}
