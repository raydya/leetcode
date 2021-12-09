package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInStringTest {
    @Test
    public void test1() {
        final RemoveAllAdjacentDuplicatesInString solution = new RemoveAllAdjacentDuplicatesInString();
        final String output = solution.removeDuplicates("abbaca");

        Assert.assertEquals("ca", output);
    }
}
