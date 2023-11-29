package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SmallestInfiniteSetTest {

    @Test
    public void test1() {
        final SmallestInfiniteSet solution = new SmallestInfiniteSet();
        solution.addBack(2);

        final int output1 = solution.popSmallest();
        Assert.assertEquals(1, output1);

        final int output2 = solution.popSmallest();
        Assert.assertEquals(2, output2);

        final int output3 = solution.popSmallest();
        Assert.assertEquals(3, output3);

        solution.addBack(1);

        final int output4 = solution.popSmallest();
        Assert.assertEquals(1, output4);

        final int output5 = solution.popSmallest();
        Assert.assertEquals(4, output5);

        final int output6 = solution.popSmallest();
        Assert.assertEquals(5, output6);
    }

    @Test
    public void test2() {
        final SmallestInfiniteSet solution = new SmallestInfiniteSet();

        final int output1 = solution.popSmallest();
        Assert.assertEquals(1, output1);

        final int output2 = solution.popSmallest();
        Assert.assertEquals(2, output2);

        solution.addBack(3);

        final int output3 = solution.popSmallest();
        Assert.assertEquals(3, output3);

        solution.addBack(2);

        final int output4 = solution.popSmallest();
        Assert.assertEquals(2, output4);

        final int output5 = solution.popSmallest();
        Assert.assertEquals(4, output5);
    }

    @Test
    public void test3() {
        final SmallestInfiniteSet solution = new SmallestInfiniteSet();

        final int output1 = solution.popSmallest();
        Assert.assertEquals(1, output1);

        solution.addBack(608);

        final int output2 = solution.popSmallest();
        Assert.assertEquals(2, output2);

        solution.addBack(4);

        final int output3 = solution.popSmallest();
        Assert.assertEquals(3, output3);

        solution.addBack(384);
        solution.addBack(975);
        solution.addBack(692);
    }

    @Test
    public void test4() {
        final SmallestInfiniteSet solution = new SmallestInfiniteSet();

        final int output1 = solution.popSmallest();
        Assert.assertEquals(1, output1);

        solution.addBack(1);

        final int output2 = solution.popSmallest();
        Assert.assertEquals(1, output2);

        final int output3 = solution.popSmallest();
        Assert.assertEquals(2, output3);

        final int output4 = solution.popSmallest();
        Assert.assertEquals(3, output4);

        solution.addBack(2);
        solution.addBack(3);

        final int output5 = solution.popSmallest();
        Assert.assertEquals(2, output5);

        final int output6 = solution.popSmallest();
        Assert.assertEquals(3, output6);
    }
}
