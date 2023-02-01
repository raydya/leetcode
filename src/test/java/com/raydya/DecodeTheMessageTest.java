package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DecodeTheMessageTest {

    @Test
    public void test1() {
        final DecodeTheMessage solution = new DecodeTheMessage();
        final String output = solution.decodeMessage("the quick brown fox jumps over the lazy dog",
            "vkbs bs t suepuv");

        Assert.assertEquals("this is a secret", output);
    }

    @Test
    public void test2() {
        final DecodeTheMessage solution = new DecodeTheMessage();
        final String output = solution.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo",
            "zwx hnfx lqantp mnoeius ycgk vcnjrdb");

        Assert.assertEquals("the five boxing wizards jump quickly", output);
    }

}
