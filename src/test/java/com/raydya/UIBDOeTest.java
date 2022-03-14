package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UIBDOeTest {

    @Test
    public void test1() {
        final UIBDOe solution = new UIBDOe();
        final int output = solution.minimumOperations("rrryyyrryyyrr");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final UIBDOe solution = new UIBDOe();
        final int output = solution.minimumOperations("ryr");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final UIBDOe solution = new UIBDOe();
        final int output = solution.minimumOperations("yry");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final UIBDOe solution = new UIBDOe();
        final int output = solution.minimumOperations("yyyyryyyy");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test5() {
        final String leaves = "ryyryyyrryyyyyryyyrrryyyryryyyyryyrrryryyyryrryrrrryyyrrrrryryyrrrrryyyryyryrryryyryyyyryyrryrryryy";

        final UIBDOe solution = new UIBDOe();
        final int output = solution.minimumOperations(leaves);

        Assert.assertEquals(41, output);
    }
}
