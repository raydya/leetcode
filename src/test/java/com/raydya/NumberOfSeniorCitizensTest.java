package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSeniorCitizensTest {

    @Test
    public void test1() {
        final NumberOfSeniorCitizens solution = new NumberOfSeniorCitizens();
        final int output = solution.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final NumberOfSeniorCitizens solution = new NumberOfSeniorCitizens();
        final int output = solution.countSeniors(new String[]{"1313579440F2036", "2921522980M5644"});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final NumberOfSeniorCitizens solution = new NumberOfSeniorCitizens();
        final int output = solution.countSeniors(
            new String[]{"9751302862F0693", "3888560693F7262", "5485983835F0649", "2580974299F6042", "9976672161M6561",
                "0234451011F8013", "4294552179O6482"});

        Assert.assertEquals(4, output);
    }
}
