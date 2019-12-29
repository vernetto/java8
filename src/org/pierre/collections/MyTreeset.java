package org.pierre.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeset {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("pippo");
        treeSet.add("babbo");
        treeSet.add("liffo");
        Iterator<String> iter = treeSet.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
