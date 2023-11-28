package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FrontMiddleBackQueueTest {

    @Test
    public void test1() {
        final FrontMiddleBackQueue solution = new FrontMiddleBackQueue();
        solution.pushFront(1);
        solution.pushBack(2);
        solution.pushMiddle(3);
        solution.pushMiddle(4);

        final int output1 = solution.popFront();
        Assert.assertEquals(1, output1);

        final int output2 = solution.popMiddle();
        Assert.assertEquals(3, output2);

        final int output3 = solution.popMiddle();
        Assert.assertEquals(4, output3);

        final int output4 = solution.popBack();
        Assert.assertEquals(2, output4);

        final int output5 = solution.popFront();
        Assert.assertEquals(-1, output5);
    }

}
