package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CategorizeBoxAccordingToCriteriaTest {

    @Test
    public void test1() {
        final CategorizeBoxAccordingToCriteria solution = new CategorizeBoxAccordingToCriteria();
        final String output = solution.categorizeBox(1000, 35, 700, 300);

        Assert.assertEquals("Heavy", output);
    }

    @Test
    public void test2() {
        final CategorizeBoxAccordingToCriteria solution = new CategorizeBoxAccordingToCriteria();
        final String output = solution.categorizeBox(200, 50, 800, 50);

        Assert.assertEquals("Neither", output);
    }
}
