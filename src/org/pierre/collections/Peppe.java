package org.pierre.collections;

public class Peppe {
    String base = "a";
    {
        base = "pippo";
    }

    public static void main(String[] args) {
        Peppe peppe = new Peppe();
        System.out.println(peppe.base);

    }
}
