package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountItemsMatchingARuleTest {

    @Test
    public void test1() {
        final CountItemsMatchingARule solution = new CountItemsMatchingARule();
        final int output = solution.countMatches(
            Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
            ),
            "color",
            "silver"
        );

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final CountItemsMatchingARule solution = new CountItemsMatchingARule();
        final int output = solution.countMatches(
            Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"),
                Arrays.asList("phone", "gold", "iphone")
            ),
            "type",
            "phone"
        );

        Assert.assertEquals(2, output);
    }
}
