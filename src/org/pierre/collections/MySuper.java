package org.pierre.collections;

public class MySuper extends SuperSuper {
    String name = "MySuper";

    public static void main(String[] args) {
        MySuper mySuper = new MySuper();
        mySuper.pippo();
    }

    private void pippo() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(staticname);
    }
}

class SuperSuper {
    String name = "SuperSuper";
    static String staticname = "Static";
}



