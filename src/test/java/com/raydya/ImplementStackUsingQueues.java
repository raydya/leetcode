package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStackUsingQueues {
    @Test
    public void test1() {
        final MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        final int top = stack.top();
        Assert.assertEquals(2, top);

        final int pop = stack.pop();
        Assert.assertEquals(2, pop);

        final boolean empty = stack.empty();
        Assert.assertFalse(empty);
    }
}
