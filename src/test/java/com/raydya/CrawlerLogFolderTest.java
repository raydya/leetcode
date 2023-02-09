package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CrawlerLogFolderTest {

    @Test
    public void test1() {
        final CrawlerLogFolder solution = new CrawlerLogFolder();
        final int output = solution.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CrawlerLogFolder solution = new CrawlerLogFolder();
        final int output = solution.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final CrawlerLogFolder solution = new CrawlerLogFolder();
        final int output = solution.minOperations(new String[]{"d1/", "../", "../", "../"});

        Assert.assertEquals(0, output);
    }

}
