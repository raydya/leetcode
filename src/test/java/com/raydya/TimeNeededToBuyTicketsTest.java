package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TimeNeededToBuyTicketsTest {

    @Test
    public void test1() {
        final TimeNeededToBuyTickets solution = new TimeNeededToBuyTickets();
        final int output = solution.timeRequiredToBuy(new int[]{2, 3, 2}, 2);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final TimeNeededToBuyTickets solution = new TimeNeededToBuyTickets();
        final int output = solution.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0);

        Assert.assertEquals(8, output);
    }
}
