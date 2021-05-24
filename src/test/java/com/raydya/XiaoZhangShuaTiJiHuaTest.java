package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class XiaoZhangShuaTiJiHuaTest {
    @Test
    public void test1() {
        final XiaoZhangShuaTiJiHua solution = new XiaoZhangShuaTiJiHua();
        final int output = solution.minTime(new int[]{1, 2, 3, 3}, 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final XiaoZhangShuaTiJiHua solution = new XiaoZhangShuaTiJiHua();
        final int output = solution.minTime(new int[]{999, 999, 999}, 4);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final XiaoZhangShuaTiJiHua solution = new XiaoZhangShuaTiJiHua();
        final int output = solution.minTime(new int[]{1, 2, 3, 3, 3}, 2);

        Assert.assertEquals(3, output);
    }
}
