package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTest {

    @Test
    public void test1() {
        final UniqueMorseCodeWords solution = new UniqueMorseCodeWords();
        final int output = solution.uniqueMorseRepresentations(
            new String[]{"gin", "zen", "gig", "msg"});

        Assert.assertEquals(2, output);
    }
}
