package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunction {

    public static ArrayList<Double> diapason(int start, int end, Function<Double, Double> function) {
        ArrayList<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(function.apply((double) i));
        }
        return result;
    }
}