package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceAllSToAvoidConsecutiveRepeatingCharactersTest {
    @Test
    public void test1() {
        final ReplaceAllSToAvoidConsecutiveRepeatingCharacters solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        final String output = solution.modifyString("?zs");

        Assert.assertEquals("azs", output);
    }

    @Test
    public void test2() {
        final ReplaceAllSToAvoidConsecutiveRepeatingCharacters solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        final String output = solution.modifyString("ubv?w");

        Assert.assertEquals("ubvaw", output);
    }

    @Test
    public void test3() {
        final ReplaceAllSToAvoidConsecutiveRepeatingCharacters solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        final String output = solution.modifyString("j?qg??b");

        Assert.assertEquals("jaqgacb", output);
    }

    @Test
    public void test4() {
        final ReplaceAllSToAvoidConsecutiveRepeatingCharacters solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        final String output = solution.modifyString("??yw?ipkj?");

        Assert.assertEquals("abywaipkja", output);
    }

    @Test
    public void test5() {
        final ReplaceAllSToAvoidConsecutiveRepeatingCharacters solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        final String output = solution.modifyString("b?a");

        Assert.assertEquals("bca", output);
    }
}
