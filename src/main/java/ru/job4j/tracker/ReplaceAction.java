package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Replace Item ====");
        int idRaplace = input.askInt("Enter ID: ");
        String newName = input.askStr("Enter new name: ");
        Item replaceItem = new Item(newName);
        if (tracker.replace(idRaplace, replaceItem)) {
            System.out.println("item is replaced");
        } else {
            System.out.println("item not replaced");
        }
        return true;
    }
}
