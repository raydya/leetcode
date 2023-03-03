package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MakingFileNamesUniqueTest {

    @Test
    public void test1() {
        final MakingFileNamesUnique solution = new MakingFileNamesUnique();
        final String[] output = solution.getFolderNames(
            new String[]{
                "pes", "fifa", "gta", "pes(2019)"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "pes", "fifa", "gta", "pes(2019)"
            },
            output
        );
    }

    @Test
    public void test2() {
        final MakingFileNamesUnique solution = new MakingFileNamesUnique();
        final String[] output = solution.getFolderNames(
            new String[]{
                "gta", "gta(1)", "gta", "avalon"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "gta", "gta(1)", "gta(2)", "avalon"
            },
            output
        );
    }

    @Test
    public void test3() {
        final MakingFileNamesUnique solution = new MakingFileNamesUnique();
        final String[] output = solution.getFolderNames(
            new String[]{
                "onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"
            },
            output
        );
    }

    @Test
    public void test4() {
        final MakingFileNamesUnique solution = new MakingFileNamesUnique();
        final String[] output = solution.getFolderNames(
            new String[]{
                "wano", "wano", "wano", "wano"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "wano", "wano(1)", "wano(2)", "wano(3)"
            },
            output
        );
    }

    @Test
    public void test5() {
        final MakingFileNamesUnique solution = new MakingFileNamesUnique();
        final String[] output = solution.getFolderNames(
            new String[]{
                "kaido", "kaido(1)", "kaido", "kaido(1)"
            }
        );

        Assert.assertArrayEquals(
            new String[]{
                "kaido", "kaido(1)", "kaido(2)", "kaido(1)(1)"
            },
            output
        );
    }
}
