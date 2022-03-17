package com.raydya;

import java.util.List;
import org.junit.Test;

public class CombinationTest {

    @Test
    public void test1() {
        Combination solution = new Combination();
        List<List<Integer>> output = solution.combine(4, 2);
    }

    @Test
    public void test2() {
        Combination solution = new Combination();
        List<List<Integer>> output = solution.combine(1, 1);
    }

}
