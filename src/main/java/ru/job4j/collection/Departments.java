package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> set = new LinkedHashSet<>();
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                set.add(start + el);
                start += el + "/";
            }
        }
        return new ArrayList<>(set);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("K1/SK1/SSK2");
        listStr.add("K1/SK1/SSK1");
        List<String> deport = fillGaps(listStr);
        Collections.sort(deport, new DepDescComp());
        for (String s : deport) {
            System.out.println(s);
        }
        Collections.sort(deport);
        for (String s : deport) {
            System.out.println(s);
        }
    }
}