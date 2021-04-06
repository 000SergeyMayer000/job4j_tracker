package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = Math.min(left.length(), right.length());
        char[] charsLeft = left.toCharArray();
        char[] charsRight = right.toCharArray();
        for (int i = 0; i < size; i++) {
            if (charsLeft[i] != charsRight[i]) {
                return Character.compare(charsLeft[i], charsRight[i]);
            }

        }
        return left.length() - right.length();
    }
}