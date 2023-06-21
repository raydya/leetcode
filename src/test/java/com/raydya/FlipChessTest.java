package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FlipChessTest {

    @Test
    public void test1() {
        final FlipChess solution = new FlipChess();
        final int output = solution.flipChess(new String[]{
            "....X.", "....X.", "XOOO..", "......", "......"
        });

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final FlipChess solution = new FlipChess();
        final int output = solution.flipChess(new String[]{
            ".X.", ".O.", "XO."
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final FlipChess solution = new FlipChess();
        final int output = solution.flipChess(new String[]{
            ".......", ".......", ".......", "X......", ".O.....", "..O....", "....OOX"
        });

        Assert.assertEquals(4, output);
    }
}
