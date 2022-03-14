package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountOfMatchesInTournamentTest {

    @Test
    public void test1() {
        final CountOfMatchesInTournament solution = new CountOfMatchesInTournament();
        final int output = solution.numberOfMatches(7);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final CountOfMatchesInTournament solution = new CountOfMatchesInTournament();
        final int output = solution.numberOfMatches(14);

        Assert.assertEquals(13, output);
    }
}
