package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    private final Output out;

    public DeleteAction (Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete Item ====");
        int deleteItemId = input.askInt("Enter ID: ");
        if (tracker.delete(deleteItemId)) {
            out.println("item is delete");
        } else {
            out.println("item not delete");
        }
        return true;
    }
}
