package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String name) {
        Item[] result = new Item[this.size];
        int sizeArray = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName().equals(name)) {
                result[sizeArray] = items[i];
                sizeArray++;
            }
        }
        return Arrays.copyOf(result, sizeArray);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }


    public boolean replace(int id, Item item) {
        boolean result = false;
        int indexReplace = indexOf(id);
        if (indexReplace != -1) {
            item.setId(id);
            items[indexReplace] = item;
            result = true;
        }
        return result;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, (index + 1), items, index, size - index - 1);
            rsl = true;
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}