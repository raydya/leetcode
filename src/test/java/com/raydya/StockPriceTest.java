package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StockPriceTest {

    @Test
    public void test1() {
        final StockPrice stockPrice = new StockPrice();
        stockPrice.update(1, 10);
        stockPrice.update(2, 5);
        Assert.assertEquals(5, stockPrice.current());
        Assert.assertEquals(10, stockPrice.maximum());
        stockPrice.update(1, 3);
        Assert.assertEquals(5, stockPrice.maximum());
        stockPrice.update(4, 2);
        Assert.assertEquals(2, stockPrice.minimum());
    }

}
