package collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ivan");
        arrayList.add("Petr");
        arrayList.add("Sergej");
        for (String s : arrayList) {
            System.out.println(s);

        }
    }
}
