package org.pierre.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = getStrings();
        Iterator<String> iter = hashSet1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
        }
        System.out.println(hashSet1.size());

        HashSet<String> hashSet2 = getStrings();
        Spliterator<String> spliterator = hashSet2.spliterator();
        System.out.println(spliterator.estimateSize());
    }

    private static HashSet<String> getStrings() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("pippo");
        hashSet.add("topolino");
        hashSet.add("pluto");
        return hashSet;
    }
}
