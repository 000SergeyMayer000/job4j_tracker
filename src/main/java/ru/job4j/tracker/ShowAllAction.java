package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Output out = new ConsoleOutput();
        Item[] allItems = tracker.findAll();
        for (Item allItem : allItems) {
            out.println(allItem);
        }
        return true;
    }
}
