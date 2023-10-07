package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StockSpannerTest {

    @Test
    public void test1() {
        final StockSpanner stockSpanner = new StockSpanner();

        final int output1 = stockSpanner.next(100);
        Assert.assertEquals(1, output1);

        final int output2 = stockSpanner.next(80);
        Assert.assertEquals(1, output2);

        final int output3 = stockSpanner.next(60);
        Assert.assertEquals(1, output3);

        final int output4 = stockSpanner.next(70);
        Assert.assertEquals(2, output4);

        final int output5 = stockSpanner.next(60);
        Assert.assertEquals(1, output5);

        final int output6 = stockSpanner.next(75);
        Assert.assertEquals(4, output6);

        final int output7 = stockSpanner.next(85);
        Assert.assertEquals(6, output7);
    }

}
