package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ComplementOfBase10IntegerTest {

    @Test
    public void test1() {
        final ComplementOfBase10Integer solution = new ComplementOfBase10Integer();
        final int output = solution.bitwiseComplement(5);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final ComplementOfBase10Integer solution = new ComplementOfBase10Integer();
        final int output = solution.bitwiseComplement(7);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final ComplementOfBase10Integer solution = new ComplementOfBase10Integer();
        final int output = solution.bitwiseComplement(10);

        Assert.assertEquals(5, output);
    }
}
