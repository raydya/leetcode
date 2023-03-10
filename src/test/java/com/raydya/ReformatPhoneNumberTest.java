package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReformatPhoneNumberTest {

    @Test
    public void test1() {
        final ReformatPhoneNumber solution = new ReformatPhoneNumber();
        final String output = solution.reformatNumber("1-23-45 6");

        Assert.assertEquals("123-456", output);
    }

    @Test
    public void test2() {
        final ReformatPhoneNumber solution = new ReformatPhoneNumber();
        final String output = solution.reformatNumber("123 4-567");

        Assert.assertEquals("123-45-67", output);
    }

    @Test
    public void test3() {
        final ReformatPhoneNumber solution = new ReformatPhoneNumber();
        final String output = solution.reformatNumber("123 4-5678");

        Assert.assertEquals("123-456-78", output);
    }

    @Test
    public void test4() {
        final ReformatPhoneNumber solution = new ReformatPhoneNumber();
        final String output = solution.reformatNumber("12");

        Assert.assertEquals("12", output);
    }

    @Test
    public void test5() {
        final ReformatPhoneNumber solution = new ReformatPhoneNumber();
        final String output = solution.reformatNumber("--17-5 229 35-39475 ");

        Assert.assertEquals("175-229-353-94-75", output);
    }
}
