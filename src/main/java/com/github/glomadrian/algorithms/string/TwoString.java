package com.github.glomadrian.algorithms.string;

import com.github.glomadrian.common.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings,  and , determine if they share a common substring.
 *
 * @author Adrián García Lomas
 */
public class TwoString {

    public List<Boolean> shareCommonSubString(List<Pair<String, String>> pairs) {
        List<Boolean> results = new ArrayList<>();
        for (Pair<String, String> pair : pairs) {
            results.add(shareCommonSubString(pair.getPair1(), pair.getPair2()));
        }
        return results;
    }

    public boolean shareCommonSubString(String firstString, String secondString) {
        for (char character : firstString.toCharArray()) {
            if (isCharacterSharedInString(character, secondString)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCharacterSharedInString(char character, String compareString) {
        char[] charsToCompare = compareString.toCharArray();
        for (char charToCompare : charsToCompare) {
            if (charToCompare == character) {
                return true;
            }
        }
        return false;
    }
}
