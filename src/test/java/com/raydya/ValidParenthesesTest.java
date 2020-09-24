package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        String input = "()";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        String input = "()[]{}";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertTrue(valid);
    }

    @Test
    public void test3() {
        String input = "(]";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertFalse(valid);
    }

    @Test
    public void test4() {
        String input = "([)]";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertFalse(valid);
    }

    @Test
    public void test5() {
        String input = "{[]}";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertTrue(valid);
    }

    @Test
    public void test6() {
        String input = "]";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertFalse(valid);
    }

    @Test
    public void test7() {
        String input = "(])";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertFalse(valid);
    }

    @Test
    public void test8() {
        String input = "(){}}{";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertFalse(valid);
    }

    @Test
    public void test9() {
        String input = "(}{)";

        final ValidParentheses validParentheses = new ValidParentheses();
        final boolean valid = validParentheses.isValid(input);

        Assert.assertFalse(valid);
    }
}
