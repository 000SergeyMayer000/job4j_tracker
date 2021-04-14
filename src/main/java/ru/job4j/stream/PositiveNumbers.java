package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 5, 4, 7, 8);
        List<Integer> rsl = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        rsl.forEach(System.out::print);
    }
}
