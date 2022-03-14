package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReorderDataInLogFilesTest {

    @Test
    public void test1() {
        final ReorderDataInLogFiles solution = new ReorderDataInLogFiles();
        final String[] output = solution.reorderLogFiles(
            new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig",
                "let3 art zero"});

        Assert.assertArrayEquals(
            new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1",
                "dig2 3 6"}, output);
    }

    @Test
    public void test2() {
        final ReorderDataInLogFiles solution = new ReorderDataInLogFiles();
        final String[] output = solution.reorderLogFiles(
            new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"});

        Assert.assertArrayEquals(
            new String[]{"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"},
            output);
    }
}
