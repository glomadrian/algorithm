package com.github.glomadrian.algorithms.string;


import com.github.glomadrian.common.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrián García Lomas
 */
public class TwoStringTest {

    @Test
    public void testTwoStringShareASubstring() {
        String firstString = "testOne";
        String secondString = "testTwo";
        TwoString  toTwoString = givenATwoString();

        boolean result = toTwoString.shareCommonSubString(firstString, secondString);

        Assert.assertTrue(result);
    }

    private TwoString givenATwoString() {
        return new TwoString();
    }

    @Test
    public void testTwoStringNotShareASubString() {
        String firstString = "one";
        String secondString = "asd";
        TwoString  toTwoString = givenATwoString();

        boolean result = toTwoString.shareCommonSubString(firstString, secondString);

        Assert.assertFalse(result);
    }

    @Test
    public void givenAListOfPairStringTheResultShouldBeOk() {
        Pair<String, String> pair1 = new Pair<>("hello", "world");
        Pair<String, String> pair2 = new Pair<>("hi", "world");
        List<Pair<String, String>> pairs = new ArrayList<>();
        pairs.add(pair1);
        pairs.add(pair2);
        TwoString  toTwoString = givenATwoString();

        List<Boolean> results = toTwoString.shareCommonSubString(pairs);

        Assert.assertTrue(results.get(0));
        Assert.assertFalse(results.get(1));
    }
}
