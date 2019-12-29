package org.pierre.collections;

public class MyRef {
    static void bau(StringBuilder pippo) {
        pippo = new StringBuilder("miao");
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder().append("ciao");
        bau(sb);
        System.out.println(sb);
    }
}
