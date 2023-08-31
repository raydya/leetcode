package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountVowelSubstringsOfAStringTest {

    @Test
    public void test1() {
        final CountVowelSubstringsOfAString solution = new CountVowelSubstringsOfAString();
        final int output = solution.countVowelSubstrings("aeiouu");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountVowelSubstringsOfAString solution = new CountVowelSubstringsOfAString();
        final int output = solution.countVowelSubstrings("unicornarihan");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountVowelSubstringsOfAString solution = new CountVowelSubstringsOfAString();
        final int output = solution.countVowelSubstrings("cuaieuouac");

        Assert.assertEquals(7, output);
    }

    @Test
    public void test4() {
        final CountVowelSubstringsOfAString solution = new CountVowelSubstringsOfAString();
        final int output = solution.countVowelSubstrings("bbaeixoubb");

        Assert.assertEquals(0, output);
    }
}
