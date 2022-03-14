package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GoatLatinTest {

    @Test
    public void test1() {
        final GoatLatin solution = new GoatLatin();
        final String output = solution.toGoatLatin("I speak Goat Latin");

        Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", output);
    }

    @Test
    public void test2() {
        final GoatLatin solution = new GoatLatin();
        final String output = solution.toGoatLatin("The quick brown fox jumped over the lazy dog");

        Assert.assertEquals(
            "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
            output);
    }
}
