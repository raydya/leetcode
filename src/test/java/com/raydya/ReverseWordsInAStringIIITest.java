package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringIIITest {

    @Test
    public void test1() {
        final ReverseWordsInAStringIII solution = new ReverseWordsInAStringIII();
        final String output = solution.reverseWords("Let's take LeetCode contest");

        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", output);
    }
}
