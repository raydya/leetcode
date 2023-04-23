package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDifferentIntegersInAStringTest {

    @Test
    public void test1() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("a123bc34d8ef34");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("leet1234code234");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("a1b01c001");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("4");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("167278959591294");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test6() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers(
            "2393706880236110407059624696967828762752651982730115221690437821508229419410771541532394006597463715513741725852432559057224478815116557380260390432211227579663571046845842281704281749571110076974264971989893607137140456254346955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716z97438020429952944646288084173334701047574188936201324845149110176716130267041674438237608038734431519439828191344238609567530399189316846359766256507371240530620697102864238792350289978450509162697068948604722646739174590530336510475061521094503850598453536706982695212493902968251702853203929616930291257062173c79487281900662343830648295410");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test7() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss");

        Assert.assertEquals(8, output);
    }
}
