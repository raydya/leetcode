package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class DestinationCityTest {

    @Test
    public void test1() {
        final DestinationCity solution = new DestinationCity();
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        final String output = solution.destCity(paths);

        Assert.assertEquals("Sao Paulo", output);
    }

    @Test
    public void test2() {
        final DestinationCity solution = new DestinationCity();
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("B", "C"));
        paths.add(Arrays.asList("D", "B"));
        paths.add(Arrays.asList("C", "A"));
        final String output = solution.destCity(paths);

        Assert.assertEquals("A", output);
    }

    @Test
    public void test3() {
        final DestinationCity solution = new DestinationCity();
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("A", "Z"));
        final String output = solution.destCity(paths);

        Assert.assertEquals("Z", output);
    }
}
