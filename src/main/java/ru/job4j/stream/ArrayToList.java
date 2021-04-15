package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToList {
    public static List<Integer> convert(Integer[][] array) {
        return Stream.of(array).flatMap(Arrays::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        List<Integer> rsl = convert(arr);
        System.out.println(rsl);

    }
}

