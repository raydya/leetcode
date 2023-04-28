package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfTheSentenceIsPangramTest {

    @Test
    public void test1() {
        final CheckIfTheSentenceIsPangram solution = new CheckIfTheSentenceIsPangram();
        final boolean output = solution.checkIfPangram(
            "thequickbrownfoxjumpsoverthelazydog");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfTheSentenceIsPangram solution = new CheckIfTheSentenceIsPangram();
        final boolean output = solution.checkIfPangram("leetcode");

        Assert.assertFalse(output);
    }

}
