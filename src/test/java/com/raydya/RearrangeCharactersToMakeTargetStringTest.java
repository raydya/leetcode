package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RearrangeCharactersToMakeTargetStringTest {

    @Test
    public void test1() {
        final RearrangeCharactersToMakeTargetString solution = new RearrangeCharactersToMakeTargetString();
        final int output = solution.rearrangeCharacters("ilovecodingonleetcode", "code");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final RearrangeCharactersToMakeTargetString solution = new RearrangeCharactersToMakeTargetString();
        final int output = solution.rearrangeCharacters("abcba", "abc");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final RearrangeCharactersToMakeTargetString solution = new RearrangeCharactersToMakeTargetString();
        final int output = solution.rearrangeCharacters("abbaccaddaeea", "aaaaa");

        Assert.assertEquals(1, output);
    }

}
