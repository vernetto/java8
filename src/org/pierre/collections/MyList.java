package org.pierre.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        var name = "";
        List<String> pippo = List.of("A", "B");
        List list = new ArrayList<>(pippo);
        list.addAll(1, List.of("A", "C"));
        System.out.println(list);
        list.remove("A");
        System.out.println(list);
    }
    void pippo() throws NullPointerException, IOException {
        throw new IOException();
    }
}
