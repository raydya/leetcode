package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddressTest {

    @Test
    public void test1() {
        final UniqueEmailAddress solution = new UniqueEmailAddress();
        final int output = solution.numUniqueEmails(
            new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
            }
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final UniqueEmailAddress solution = new UniqueEmailAddress();
        final int output = solution.numUniqueEmails(
            new String[]{
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"
            }
        );

        Assert.assertEquals(3, output);
    }
}
