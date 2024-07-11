package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveLetterToEqualizeFrequencyTest {

    @Test
    public void test1() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("abcc");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("aazz");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("bac");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("cccaa");

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("cbccca");

        Assert.assertFalse(output);
    }

    @Test
    public void test6() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("ddaccb");

        Assert.assertFalse(output);
    }

    @Test
    public void test7() {
        final RemoveLetterToEqualizeFrequency solution = new RemoveLetterToEqualizeFrequency();
        final boolean output = solution.equalFrequency("zz");

        Assert.assertTrue(output);
    }
}
