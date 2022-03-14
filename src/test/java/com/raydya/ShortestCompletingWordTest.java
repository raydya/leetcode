package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ShortestCompletingWordTest {

    @Test
    public void test1() {
        final ShortestCompletingWord solution = new ShortestCompletingWord();
        final String output = solution.shortestCompletingWord("1s3 PSt",
            new String[]{"step", "steps", "stripe", "stepple"});

        Assert.assertEquals("steps", output);
    }

    @Test
    public void test2() {
        final ShortestCompletingWord solution = new ShortestCompletingWord();
        final String output = solution.shortestCompletingWord("1s3 456",
            new String[]{"looks", "pest", "stew", "show"});

        Assert.assertEquals("pest", output);
    }

    @Test
    public void test3() {
        final ShortestCompletingWord solution = new ShortestCompletingWord();
        final String output = solution.shortestCompletingWord("Ah71752",
            new String[]{"suggest", "letter", "of", "husband", "easy", "education", "drug",
                "prevent", "writer", "old"});

        Assert.assertEquals("husband", output);
    }

    @Test
    public void test4() {
        final ShortestCompletingWord solution = new ShortestCompletingWord();
        final String output = solution.shortestCompletingWord("OgEu755",
            new String[]{"enough", "these", "play", "wide", "wonder", "box", "arrive", "money",
                "tax", "thus"});

        Assert.assertEquals("enough", output);
    }

    @Test
    public void test5() {
        final ShortestCompletingWord solution = new ShortestCompletingWord();
        final String output = solution.shortestCompletingWord("iMSlpe4",
            new String[]{"claim", "consumer", "student", "camera", "public", "never", "wonder",
                "simple", "thought", "use"});

        Assert.assertEquals("simple", output);
    }
}
