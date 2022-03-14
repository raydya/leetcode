package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void test1() {
        final ReplaceElementsWithGreatestElementOnRightSide solution = new ReplaceElementsWithGreatestElementOnRightSide();
        final int[] output = solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1});

        Assert.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, output);
    }

    @Test
    public void test2() {
        final ReplaceElementsWithGreatestElementOnRightSide solution = new ReplaceElementsWithGreatestElementOnRightSide();
        final int[] output = solution.replaceElements(new int[]{400});

        Assert.assertArrayEquals(new int[]{-1}, output);
    }
}
