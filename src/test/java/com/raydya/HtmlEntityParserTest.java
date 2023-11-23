package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HtmlEntityParserTest {

    @Test
    public void test1() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("&amp; is an HTML entity but &ambassador; is not.");

        Assert.assertEquals("& is an HTML entity but &ambassador; is not.", output);
    }

    @Test
    public void test2() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("and I quote: &quot;...&quot;");

        Assert.assertEquals("and I quote: \"...\"", output);
    }

    @Test
    public void test3() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("Stay home! Practice on Leetcode :)");

        Assert.assertEquals("Stay home! Practice on Leetcode :)", output);
    }

    @Test
    public void test4() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("x &gt; y &amp;&amp; x &lt; y is always false");

        Assert.assertEquals("x > y && x < y is always false", output);
    }

    @Test
    public void test5() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("leetcode.com&frasl;problemset&frasl;all");

        Assert.assertEquals("leetcode.com/problemset/all", output);
    }

    @Test
    public void test6() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("&amp;gt;");

        Assert.assertEquals("&gt;", output);
    }

    @Test
    public void test7() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser(" &amp; &gt; 8|eK8FDRO");

        Assert.assertEquals(" & > 8|eK8FDRO", output);
    }

    @Test
    public void test8() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("&&gt;");

        Assert.assertEquals("&>", output);
    }

    @Test
    public void test9() {
        final HtmlEntityParser solution = new HtmlEntityParser();
        final String output = solution.entityParser("&&&");

        Assert.assertEquals("&&&", output);
    }
}
