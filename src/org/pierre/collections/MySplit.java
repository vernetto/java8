package org.pierre.collections;

import java.util.Arrays;

public class MySplit {
    public static void main(String[] args) {
        String string = "foo:and:bar";
        String[] array = string.split(":", 2);
        System.out.println(Arrays.toString( array));
    }
}
