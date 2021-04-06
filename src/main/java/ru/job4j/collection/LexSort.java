package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
              String leftInt = left.replaceAll("\\D+", "");
        String rightInt = right.replaceAll("\\D+", "");
        return Integer.valueOf(leftInt) - Integer.valueOf(rightInt);

    }
}