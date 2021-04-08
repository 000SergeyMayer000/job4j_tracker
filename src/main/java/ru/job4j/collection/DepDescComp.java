package ru.job4j.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int rsl = 0;
        ArrayList<String> listStr1 = new ArrayList<>(Arrays.asList(str1.split("/")));
        ArrayList<String> listStr2 = new ArrayList<>(Arrays.asList(str2.split("/")));
        for (int i = 0; i < Math.min(listStr1.size(), listStr2.size()); i++) {
            int compare = listStr1.get(i).compareTo(listStr2.get(i));
            if (compare != 0) {
                rsl = compare;
                break;
            }
        }
        if (rsl == 0) {
            rsl = listStr1.size() - listStr2.size();
        }
        return rsl;
    }
}