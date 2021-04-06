package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }


    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Output out = new ConsoleOutput();
        ArrayList <Item> allItems = tracker.findAll();
        for (Item allItem : allItems) {
            out.println(allItem);
        }
        return true;
    }
}
