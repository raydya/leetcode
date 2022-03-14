package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ImplementQueueUsingStacksTest {

    @Test
    public void test1() {
        final ImplementQueueUsingStacks.MyQueue solution = new ImplementQueueUsingStacks.MyQueue();
        solution.push(1);
        solution.push(2);
        Assert.assertEquals(1, solution.peek());
        Assert.assertEquals(1, solution.pop());
        Assert.assertFalse(solution.empty());
    }
}
