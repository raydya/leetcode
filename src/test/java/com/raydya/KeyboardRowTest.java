package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRowTest {

    @Test
    public void test1() {
        final KeyboardRow solution = new KeyboardRow();
        final String[] output = solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});

        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"}, output);
    }

    @Test
    public void test2() {
        final KeyboardRow solution = new KeyboardRow();
        final String[] output = solution.findWords(new String[]{"omk"});

        Assert.assertArrayEquals(new String[]{}, output);
    }

    @Test
    public void test3() {
        final KeyboardRow solution = new KeyboardRow();
        final String[] output = solution.findWords(new String[]{"adsdf", "sfd"});

        Assert.assertArrayEquals(new String[]{"adsdf", "sfd"}, output);
    }
}
