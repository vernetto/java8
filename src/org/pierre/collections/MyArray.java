package org.pierre.collections;

import java.io.IOException;

public class MyArray extends MyBaseArray {
    public static void main(String[] args) {
        String[][] array = {{"a", "b"}, {"c", "d"}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(array[i][j]);
            }
        }
        MyArray myArray = new MyArray();

    }
    void pippo(String arg) throws Exception {
    }

}

class MyBaseArray {
    public static void pippo() {

    }
}
