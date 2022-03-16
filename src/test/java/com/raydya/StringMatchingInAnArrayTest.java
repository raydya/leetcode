package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class StringMatchingInAnArrayTest {

    @Test
    public void test1() {
        StringMatchingInAnArray solution = new StringMatchingInAnArray();
        List<String> output = solution.stringMatching(
            new String[]{"mass", "as", "hero", "superhero"});

        Assert.assertArrayEquals(new String[]{"as", "hero"}, output.toArray());
    }

    @Test
    public void test2() {
        StringMatchingInAnArray solution = new StringMatchingInAnArray();
        List<String> output = solution.stringMatching(
            new String[]{"leetcode", "et", "code"});

        Assert.assertArrayEquals(new String[]{"et", "code"}, output.toArray());
    }

    @Test
    public void test3() {
        StringMatchingInAnArray solution = new StringMatchingInAnArray();
        List<String> output = solution.stringMatching(
            new String[]{"blue", "green", "bu"});

        Assert.assertArrayEquals(new String[]{}, output.toArray());
    }

    @Test
    public void test4() {
        StringMatchingInAnArray solution = new StringMatchingInAnArray();
        List<String> output = solution.stringMatching(
            new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"});

        Assert.assertArrayEquals(new String[]{"leetcode", "od", "am"}, output.toArray());
    }

}
