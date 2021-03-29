package ru.job4j.tracker;

import java.util.ArrayList;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        ArrayList <Item> result = tracker.findByName(name);
        for (Item item : result) {
            System.out.println(item);
        }
        if (result.size() == 0) {
            System.out.println("Заявок с таким именем нет");
        }
        return true;
    }
}
