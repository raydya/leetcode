package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LicenseKeyFormattingTest {

    @Test
    public void test1() {
        final LicenseKeyFormatting solution = new LicenseKeyFormatting();
        final String output = solution.licenseKeyFormatting("5F3Z-2e-9-w", 4);

        Assert.assertEquals("5F3Z-2E9W", output);
    }

    @Test
    public void test2() {
        final LicenseKeyFormatting solution = new LicenseKeyFormatting();
        final String output = solution.licenseKeyFormatting("2-5g-3-J", 2);

        Assert.assertEquals("2-5G-3J", output);
    }

    @Test
    public void test3() {
        final String s = "--------EyRfCyHxyUJzhygiazYpjuDFdHvrnDwoQKQEsccLDiwhpmjueADIzqIvExbDDFnEGovAxYeszbzuTekRuWUPXRPbVKJuDQzIzzTj";
        final int k = 16;

        final LicenseKeyFormatting solution = new LicenseKeyFormatting();
        final String output = solution.licenseKeyFormatting(s, k);

        Assert.assertEquals(output,
            "EYRF-CYHXYUJZHYGIAZYP-JUDFDHVRNDWOQKQE-SCCLDIWHPMJUEADI-ZQIVEXBDDFNEGOVA-XYESZBZUTEKRUWUP-XRPBVKJUDQZIZZTJ");
    }

    @Test
    public void test4() {
        final LicenseKeyFormatting solution = new LicenseKeyFormatting();
        final String output = solution.licenseKeyFormatting("---", 3);

        Assert.assertEquals("", output);
    }
}
