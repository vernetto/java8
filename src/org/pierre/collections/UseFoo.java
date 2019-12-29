package org.pierre.collections;

public class UseFoo {
    public static void main(String[] args) {
        Foo foo = (String arg1, Integer arg2) -> Integer.valueOf(arg2).equals(arg1);
        System.out.println(foo.myMethod("2", 2));
    }
}
