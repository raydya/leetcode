package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MagicDictionaryTest {

    @Test
    public void test1() {
        final MagicDictionary solution = new MagicDictionary();
        solution.buildDict(new String[]{"hello", "leetcode"});

        final boolean output1 = solution.search("hello");
        Assert.assertFalse(output1);

        final boolean output2 = solution.search("hhllo");
        Assert.assertTrue(output2);

        final boolean output3 = solution.search("hell");
        Assert.assertFalse(output3);

        final boolean output4 = solution.search("leetcoded");
        Assert.assertFalse(output4);
    }

}
