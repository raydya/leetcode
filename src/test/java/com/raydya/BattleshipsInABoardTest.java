package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BattleshipsInABoardTest {

    @Test
    public void test1() {
        final BattleshipsInABoard solution = new BattleshipsInABoard();
        final int output = solution.countBattleShips(new char[][]{
            {'X', '.', '.', 'X'},
            {'.', '.', '.', 'X'},
            {'.', '.', '.', 'X'}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final BattleshipsInABoard solution = new BattleshipsInABoard();
        final int output = solution.countBattleShips(new char[][]{
            {'.'}
        });

        Assert.assertEquals(0, output);
    }
}
