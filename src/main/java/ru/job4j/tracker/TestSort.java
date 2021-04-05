package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Item> arrayList = new ArrayList<>();
       arrayList.add( new Item("222"));
        arrayList.add( new Item("111"));
        arrayList.add( new Item("333"));

        for (Item item : arrayList) {
            System.out.println(item);
        }

        Collections.sort(arrayList, new SortByNameItem());

        System.out.println("Лист отсортирован по возрастанию");
        for (Item item : arrayList) {
            System.out.println(item
            );
        }

        Collections.sort(arrayList, new SortByNameItemReverse());

        System.out.println("Лист отсортирован по убыванию");
        for (Item item : arrayList) {
            System.out.println(item
            );
        }
    }
}
