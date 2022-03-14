package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void test1() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        final int peek = myQueue.peek();
        Assert.assertEquals(1, peek);

        final int pop = myQueue.pop();
        Assert.assertEquals(1, pop);

        final boolean empty = myQueue.empty();
        Assert.assertFalse(empty);
    }
}
