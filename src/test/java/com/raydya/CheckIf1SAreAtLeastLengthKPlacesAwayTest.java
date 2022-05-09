package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIf1SAreAtLeastLengthKPlacesAwayTest {

    @Test
    public void test1() {
        final CheckIf1SAreAtLeastLengthKPlacesAway solution = new CheckIf1SAreAtLeastLengthKPlacesAway();
        final boolean output = solution.kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIf1SAreAtLeastLengthKPlacesAway solution = new CheckIf1SAreAtLeastLengthKPlacesAway();
        final boolean output = solution.kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIf1SAreAtLeastLengthKPlacesAway solution = new CheckIf1SAreAtLeastLengthKPlacesAway();
        final boolean output = solution.kLengthApart(new int[]{1, 1, 1, 1, 1}, 0);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final CheckIf1SAreAtLeastLengthKPlacesAway solution = new CheckIf1SAreAtLeastLengthKPlacesAway();
        final boolean output = solution.kLengthApart(new int[]{0, 1, 0, 1}, 1);

        Assert.assertTrue(output);
    }

}
