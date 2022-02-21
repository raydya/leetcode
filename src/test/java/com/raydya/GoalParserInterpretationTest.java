package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GoalParserInterpretationTest {
    @Test
    public void test1() {
        final GoalParserInterpretation solution = new GoalParserInterpretation();
        final String output = solution.interpret("G()(al)");

        Assert.assertEquals("Goal", output);
    }

    @Test
    public void test2() {
        final GoalParserInterpretation solution = new GoalParserInterpretation();
        final String output = solution.interpret("G()()()()(al)");

        Assert.assertEquals("Gooooal", output);
    }

    @Test
    public void test3() {
        final GoalParserInterpretation solution = new GoalParserInterpretation();
        final String output = solution.interpret("(al)G(al)()()G");

        Assert.assertEquals("alGalooG", output);
    }
}
