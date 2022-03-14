package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindWordsThatCanBeFormedByCharactersTest {

    @Test
    public void test1() {
        final FindWordsThatCanBeFormedByCharacters solution = new FindWordsThatCanBeFormedByCharacters();
        final int output = solution.countCharacters(new String[]{"cat", "bt", "hat", "tree"},
            "atach");

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final FindWordsThatCanBeFormedByCharacters solution = new FindWordsThatCanBeFormedByCharacters();
        final int output = solution.countCharacters(new String[]{"hello", "world", "leetcode"},
            "welldonehoneyr");

        Assert.assertEquals(10, output);
    }
}
