package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheKBeautyOfANumberTest {

    @Test
    public void test1() {
        final FindTheKBeautyOfANumber solution = new FindTheKBeautyOfANumber();
        final int output = solution.divisorSubstrings(240, 2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindTheKBeautyOfANumber solution = new FindTheKBeautyOfANumber();
        final int output = solution.divisorSubstrings(430043, 2);

        Assert.assertEquals(2, output);
    }
}
