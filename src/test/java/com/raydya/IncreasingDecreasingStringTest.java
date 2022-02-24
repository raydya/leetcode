package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingDecreasingStringTest {

  @Test
  public void test1() {
    IncreasingDecreasingString solution = new IncreasingDecreasingString();
    String output = solution.sortString("aaaabbbbcccc");

    Assert.assertEquals("abccbaabccba", output);
  }

  @Test
  public void test2() {
    IncreasingDecreasingString solution = new IncreasingDecreasingString();
    String output = solution.sortString("rat");

    Assert.assertEquals("art", output);
  }

  @Test
  public void test3() {
    IncreasingDecreasingString solution = new IncreasingDecreasingString();
    String output = solution.sortString("leetcode");

    Assert.assertEquals("cdelotee", output);
  }

  @Test
  public void test4() {
    IncreasingDecreasingString solution = new IncreasingDecreasingString();
    String output = solution.sortString("ggggggg");

    Assert.assertEquals("ggggggg", output);
  }

  @Test
  public void test5() {
    IncreasingDecreasingString solution = new IncreasingDecreasingString();
    String output = solution.sortString("spo");

    Assert.assertEquals("ops", output);
  }
}
